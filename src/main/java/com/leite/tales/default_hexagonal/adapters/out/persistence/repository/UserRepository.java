package com.leite.tales.default_hexagonal.adapters.out.persistence.repository;


import com.leite.tales.default_hexagonal.adapters.out.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    UserEntity findByNome(String nome);
}
