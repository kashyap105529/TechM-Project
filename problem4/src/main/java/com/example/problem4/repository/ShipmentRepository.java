package com.example.problem4.repository;
import com.example.problem4.model.Shipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

    Shipment findByTrackNo(String trackNo);

}
