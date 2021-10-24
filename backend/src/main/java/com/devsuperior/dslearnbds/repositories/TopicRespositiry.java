package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Topic;

public interface TopicRespositiry extends JpaRepository<Topic, Long> {

}
