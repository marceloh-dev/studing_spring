package com.studingspring.studyspring.services;

import org.springframework.stereotype.Service;

import com.studingspring.studyspring.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

}
