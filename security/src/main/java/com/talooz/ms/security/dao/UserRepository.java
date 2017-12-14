package com.talooz.ms.security.dao;

import org.springframework.data.repository.CrudRepository;

import com.talooz.ms.security.model.ApplicationUser;

public interface UserRepository extends CrudRepository<ApplicationUser, Long> {

	ApplicationUser findByUsername(String username);

	ApplicationUser findByUsernameAndPassword(String username, String password);
}
