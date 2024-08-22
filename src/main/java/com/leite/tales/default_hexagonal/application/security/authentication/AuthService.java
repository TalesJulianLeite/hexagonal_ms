package com.leite.tales.default_hexagonal.application.security.authentication;


import com.leite.tales.default_hexagonal.adapters.out.persistence.entity.UserEntity;

public interface AuthService {

    UserEntity buscarPorNome(String nome);

    void setExpoToken(String token);

    String alterarSenha(UserEntity user, String novaSenha) throws Exception;
}
