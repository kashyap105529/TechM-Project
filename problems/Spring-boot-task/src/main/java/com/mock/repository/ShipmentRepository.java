package com.mock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.entity.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment,Integer> {
	
	public List<Shipment> findByTrackNo(String trackNo);
	
	public Shipment findByShipId(int shipId);

}
