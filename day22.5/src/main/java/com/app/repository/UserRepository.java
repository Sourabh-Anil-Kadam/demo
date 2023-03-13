package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.dto.UserDTO;
import com.app.entities.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	@Query("select u from UserEntity u  where u.username=?1")
	Optional<UserEntity> findByUserName(String username);
	

}
