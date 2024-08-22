package com.leite.tales.default_hexagonal.adapters.in.controller;

import com.leite.tales.default_hexagonal.adapters.out.controller.response.UserResponseDto;
import com.leite.tales.default_hexagonal.application.ports.in.UserServicePort;
import com.leite.tales.default_hexagonal.domain.exceptions.user.UserNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserController {

    private final UserServicePort userServicePort;

    public UserController(UserServicePort userServicePort) {
        this.userServicePort = userServicePort;
    }

    @GetMapping(value = "/get",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUsers(){
        UserResponseDto dto = null;
        try {
            return ResponseEntity.ok(dto);
        } catch (Exception e){
            throw new UserNotFoundException("Usuário não encontrado");
        }
    }
}
