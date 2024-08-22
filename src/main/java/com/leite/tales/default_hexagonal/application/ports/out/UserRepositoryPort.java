package com.leite.tales.default_hexagonal.application.ports.out;


import com.leite.tales.default_hexagonal.domain.User;

import java.util.List;

public interface UserRepositoryPort {
    List<User> findAll();
    User save(User user);
}
