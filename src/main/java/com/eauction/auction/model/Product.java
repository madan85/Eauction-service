package com.eauction.auction.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor	
@Document(collection="productdetails")
public class Product {
	
	    @Id
	    private String id;
	    private String productName;	    
	    private String shortDescription;	    
	    private String detailedDescription;	    
	    private String category;	    
	    private String startingPrice;	    
	    private String bidEndDate;	    
	    private Integer sellerId;

}
