package com.danielfreitassc.gateway.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.danielfreitassc.gateway.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID>{
    UserDetails findByUsername(String username);
}
