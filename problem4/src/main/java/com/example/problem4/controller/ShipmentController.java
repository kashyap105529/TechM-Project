package com.example.problem4.controller;


import com.example.problem4.model.Shipment;
import com.example.problem4.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("/{trackNo}")
    public ResponseEntity<Shipment> getShipmentByTrackNo(@PathVariable String trackNo) {
        Shipment shipment = shipmentService.getShipmentByTrackNo(trackNo);
        if (shipment != null) {
            return ResponseEntity.ok().body(shipment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<String> deleteShipmentByShipId(@PathVariable Integer shipId) {
        String response = shipmentService.deleteShipmentByShipId(shipId);
        return ResponseEntity.ok().body(response);
    }
}
