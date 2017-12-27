package com.talooz.ms.profiles.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.talooz.ms.profiles.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUsername(@Param("username") String username);

	List<User> findByFirstName(@Param("firstName") String firstName);
}
