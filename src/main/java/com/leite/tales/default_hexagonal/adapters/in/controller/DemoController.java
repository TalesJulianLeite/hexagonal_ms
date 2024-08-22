package com.leite.tales.default_hexagonal.adapters.in.controller;

import com.leite.tales.default_hexagonal.domain.templates.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class DemoController {

    @GetMapping("/success")
    public ResponseEntity<ResponseTemplate<String>> exampleEndpoint() {
        String responseData = "Exemplo de response de sucesso";

        // Usando o template para uma resposta de sucesso
        ResponseTemplate<String> response = ResponseTemplate.success(responseData);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/error")
    public ResponseEntity<ResponseTemplate<String>> errorEndpoint() {
        String errorMessage = "Exemplo de response de erro";
        // Usando o template para uma resposta de erro
        ResponseTemplate<String> response = ResponseTemplate.error(errorMessage);

        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
