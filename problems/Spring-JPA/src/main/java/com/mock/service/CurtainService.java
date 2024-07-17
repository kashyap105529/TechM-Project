package com.mock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.entity.Curtain;
import com.mock.repository.CurtainRepository;

@Service
public class CurtainService {
	@Autowired
	private CurtainRepository curtainRepo;

	public Curtain CreateCurtain(Curtain curtain) {
		return curtainRepo.save(curtain);
	}

	public List<Curtain> findCurtainsByPrice(int price) {
		return curtainRepo.getIdByPrice(price);
	}

	public List<Curtain> findCurtainsByBrand(String brand) {
		return curtainRepo.getIdByBrand(brand);
	}

}
