package com.pkielblock.spring.repositories;

import com.pkielblock.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
