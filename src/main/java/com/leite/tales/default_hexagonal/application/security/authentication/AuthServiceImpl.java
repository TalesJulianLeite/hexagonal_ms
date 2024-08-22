package com.leite.tales.default_hexagonal.application.security.authentication;

import com.leite.tales.default_hexagonal.adapters.out.persistence.entity.UserEntity;
import com.leite.tales.default_hexagonal.adapters.out.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository usuarioRepository;

    @Override
    public UserEntity buscarPorNome(String nome) {
        return usuarioRepository.findByNome(nome);
    }

    @Override
    public void setExpoToken(String token) {
        // Implementação para definir o expoToken
    }

    @Override
    public String alterarSenha(UserEntity user, String novaSenha) throws Exception {
        // Implementação para alterar a senha
        return null;
    }

}