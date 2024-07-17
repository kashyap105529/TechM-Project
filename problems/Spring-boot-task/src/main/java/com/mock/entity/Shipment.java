package com.mock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor  
@AllArgsConstructor  
@ToString 
@Entity
public class Shipment {
	@Id
	@GeneratedValue
	private int shipId;
	private String trackNo;
	private String origin;
	private String destination;
	private String status;

}
