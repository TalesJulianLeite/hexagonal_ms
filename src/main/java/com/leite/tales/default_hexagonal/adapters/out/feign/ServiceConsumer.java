package com.leite.tales.default_hexagonal.adapters.out.feign;

import com.leite.tales.default_hexagonal.adapters.out.controller.client.template.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer {

    @Autowired
    private ExternalService externalService;

    public void execute() {
        String url = "https://api-patrimonio.appdemocrata.com/v1/maquinario_setores";

        // Exemplo de chamada ao serviço externo com retorno de um DTO específico
        String response = externalService.callExternalService(url, String.class);

        System.out.println("Response: " + response);
    }
}