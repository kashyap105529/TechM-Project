package com.mock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.entity.Shipment;
import com.mock.repository.ShipmentRepository;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepo;
	
	
	public Shipment createShipment(Shipment shipment) {
		return shipmentRepo.save(shipment);
	}
	
	public List<Shipment> getShipmentByTrackNo(String trackno) {
		return shipmentRepo.findByTrackNo(trackno);
	}
	
	public void deleteShipmentByShipId(int shipId) {
		shipmentRepo.deleteById(shipId);
	}

}
