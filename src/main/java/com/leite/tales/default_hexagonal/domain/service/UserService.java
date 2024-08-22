package com.leite.tales.default_hexagonal.domain.service;


import com.leite.tales.default_hexagonal.application.ports.in.UserServicePort;
import com.leite.tales.default_hexagonal.application.ports.out.FileServicePort;
import com.leite.tales.default_hexagonal.application.ports.out.UserRepositoryPort;
import com.leite.tales.default_hexagonal.domain.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;
    private final FileServicePort fileServicePort;

    public UserService(UserRepositoryPort userRepositoryPort, FileServicePort fileServicePort) {
        this.userRepositoryPort = userRepositoryPort;
        this.fileServicePort = fileServicePort;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryPort.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }

    @Override
    public void handleFileUpload(MultipartFile file) throws IOException {
        fileServicePort.processFile(file);
    }
}