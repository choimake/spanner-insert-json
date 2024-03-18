package com.example.spannerjson.repository;

import com.example.spannerjson.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends
    JpaRepository<User, UUID> {
}
