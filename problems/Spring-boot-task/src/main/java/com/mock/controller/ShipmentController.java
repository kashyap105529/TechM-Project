package com.mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mock.entity.Shipment;
import com.mock.service.ShipmentService;

@RestController
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@PostMapping("/createShipping")
	public Shipment createShipment(@RequestBody Shipment ship) {
		return shipmentService.createShipment(ship);
	}
	
	@GetMapping("/shipment/{trackNo}")
	public List<Shipment> getShipmentsbyTrackno(@PathVariable(name ="trackNo") String trackNo){
		return shipmentService.getShipmentByTrackNo(trackNo);
	}
	
	@DeleteMapping("/shipment/{shipId}")
	public String deleteShipmentByShipId(@PathVariable(name ="shipId") int shipId) {
		shipmentService.deleteShipmentByShipId(shipId);
		return "shipment deleted successfully";
	}

}
