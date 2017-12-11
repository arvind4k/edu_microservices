package com.talooz.ms.users.dao;

import org.springframework.data.repository.CrudRepository;

import com.talooz.ms.users.entity.ApplicationUser;

public interface UserRepository extends CrudRepository<ApplicationUser, Long> {

	ApplicationUser findByUsername(String username);

	ApplicationUser findByUsernameAndPassword(String username, String password);
}
