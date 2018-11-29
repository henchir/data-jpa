package com.henchir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henchir.entities.Users;

interface UserRepository extends JpaRepository<Users, Long> {

	Users findByName(String name);
	Users findBy(String name);
	// azerty
}
