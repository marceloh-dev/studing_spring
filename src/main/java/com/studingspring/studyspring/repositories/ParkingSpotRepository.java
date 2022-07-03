package com.studingspring.studyspring.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studingspring.studyspring.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
