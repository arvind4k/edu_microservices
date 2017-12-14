package com.talooz.ms.users.dao;

import org.springframework.data.repository.CrudRepository;

import com.talooz.ms.users.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
