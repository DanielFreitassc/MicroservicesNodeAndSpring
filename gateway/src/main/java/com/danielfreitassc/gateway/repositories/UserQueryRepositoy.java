package com.danielfreitassc.gateway.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitassc.gateway.models.UserEntity;

public interface UserQueryRepositoy extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByUsername(String username);
}
