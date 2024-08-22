package com.leite.tales.default_hexagonal.adapters.in.controller;

import com.leite.tales.default_hexagonal.adapters.out.controller.response.MetricasMaquinarioDto;
import com.leite.tales.default_hexagonal.domain.templates.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metricas-maquinario")
public class MetricasMaquinarioController {

    @GetMapping("")
    public ResponseEntity<ResponseTemplate<?>> getMetricasMaquinario() {
        ResponseTemplate<MetricasMaquinarioDto> response = ResponseTemplate.success(null);
        return ResponseEntity.ok(response);
    }
}
