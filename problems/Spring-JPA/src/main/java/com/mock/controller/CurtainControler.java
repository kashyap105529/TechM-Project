package com.mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mock.entity.Curtain;
import com.mock.service.CurtainService;

@RestController
public class CurtainControler {
	
	@Autowired
	private CurtainService curtainService;
	
	
	@PostMapping("/createCurtain")
	public Curtain CreateCurtain(@RequestBody Curtain curtain) {
		return curtainService.CreateCurtain(curtain);
	}
	
	@GetMapping("/curtains/by-price")
    public List<Curtain> getCurtainsByPrice(@RequestParam int price) {
        return curtainService.findCurtainsByPrice(price);
    }

    @GetMapping("/curtains/by-brand")
    public List<Curtain> getCurtainsByBrand(@RequestParam String brand) {
        return curtainService.findCurtainsByBrand(brand);
    }

}
