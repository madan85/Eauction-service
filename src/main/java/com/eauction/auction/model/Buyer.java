package com.eauction.auction.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "buyerdetails")
public class Buyer {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Integer pin;
	private String phone;
	private String email;

}
