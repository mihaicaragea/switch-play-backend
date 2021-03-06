package com.switchplaybackend.demo.repository;

import com.switchplaybackend.demo.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OfferRepository extends JpaRepository<Offer, UUID> {

    List<Offer> getAllByGameTitle(String title);
    List<Offer> getAllByUser_Id (UUID id);


}
