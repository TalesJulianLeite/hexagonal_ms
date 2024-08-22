package com.leite.tales.default_hexagonal.adapters.out.controller.client.template;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ExternalService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "fallback")
    public <T> T callExternalService(String url, Class<T> responseType) {
        WebClient webClient = webClientBuilder.build();

        // Realizando a chamada ao serviço externo
        Mono<T> response = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(responseType);

        // Bloqueando para obter o resultado síncrono (pode ser adaptado para assíncrono)
        return response.block();
    }

    // Fallback method for Circuit Breaker
    public <T> T fallback(String url, Class<T> responseType, Throwable t) {
        // Logar o erro ou retornar um valor default
        System.out.println("Circuit breaker activated: " + t.getMessage());
        return null; // Retorne um valor padrão ou uma alternativa
    }
}