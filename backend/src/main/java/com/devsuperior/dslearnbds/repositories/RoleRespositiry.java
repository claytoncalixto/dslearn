package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Role;

public interface RoleRespositiry extends JpaRepository<Role, Long> {

}
