package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Offer;

public interface OfferRespositiry extends JpaRepository<Offer, Long> {

}
