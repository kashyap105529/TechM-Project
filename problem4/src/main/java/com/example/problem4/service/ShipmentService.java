package com.example.problem4.service;


import com.example.problem4.model.Shipment;
import com.example.problem4.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment getShipmentByTrackNo(String trackNo) {
        return shipmentRepository.findByTrackNo(trackNo);
    }

    public String deleteShipmentByShipId(Integer shipId) {
        Optional<Shipment> optionalShipment = shipmentRepository.findById(shipId);
        if (optionalShipment.isPresent()) {
            shipmentRepository.deleteById(shipId);
            return "The requested shipId-" + shipId + " got deleted";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment with shipId " + shipId + " not found");
        }
    }
}
