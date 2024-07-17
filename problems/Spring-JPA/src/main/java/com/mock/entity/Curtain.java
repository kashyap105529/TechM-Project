package com.mock.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Curtain {

	
	@Id
	@GeneratedValue
    private int id;
    private String brand;
    private String material;
    private String color;
    private int price;
}
