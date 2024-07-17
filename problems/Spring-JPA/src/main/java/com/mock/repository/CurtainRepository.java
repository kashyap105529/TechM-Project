package com.mock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mock.entity.Curtain;

public interface CurtainRepository extends JpaRepository<Curtain, Integer> {
	
	@Query("SELECT c FROM Curtain c WHERE c.price > :price")
    List<Curtain> getIdByPrice(@Param("price") int price);

    @Query("SELECT c FROM Curtain c WHERE c.brand = :brand")
    List<Curtain> getIdByBrand(@Param("brand") String brand);

}
