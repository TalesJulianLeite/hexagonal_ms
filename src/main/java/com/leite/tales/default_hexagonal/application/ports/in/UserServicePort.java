package com.leite.tales.default_hexagonal.application.ports.in;

import com.leite.tales.default_hexagonal.domain.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserServicePort {
    List<User> getAllUsers();
    User createUser(User user);
    void handleFileUpload(MultipartFile file) throws IOException;
}
