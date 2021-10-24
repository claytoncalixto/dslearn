package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Resource;

public interface ResourceRespositiry extends JpaRepository<Resource, Long> {

}
