package com.leite.tales.default_hexagonal.adapters.out.persistence.repository.impl;

import com.leite.tales.default_hexagonal.adapters.out.persistence.entity.UserEntity;
import com.leite.tales.default_hexagonal.adapters.out.persistence.repository.UserRepository;
import com.leite.tales.default_hexagonal.application.ports.out.UserRepositoryPort;
import com.leite.tales.default_hexagonal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserRepositoryImpl implements UserRepositoryPort {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll().stream()
                .map(this::mapToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = mapToEntity(user);
        UserEntity savedEntity = userRepository.save(userEntity);
        return mapToDomain(savedEntity);
    }

    private User mapToDomain(UserEntity userEntity) {
        User user = new User(userEntity.getId(), userEntity.getNome(), userEntity.getSenha(),
                userEntity.getUnidade(), userEntity.getAtivo());
        return user;
    }

    private UserEntity mapToEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setNome(user.getNome());
        userEntity.setSenha(user.getSenha());
        userEntity.setUnidade(user.getUnidade());
        userEntity.setAtivo(user.getAtivo());
        return userEntity;
    }
    
    private User mapToDto(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setNome(userEntity.getNome());
        user.setSenha(userEntity.getSenha());
        user.setUnidade(userEntity.getUnidade());
        user.setAtivo(userEntity.getAtivo());
        return user;
    }
}