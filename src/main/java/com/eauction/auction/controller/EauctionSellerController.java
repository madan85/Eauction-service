package com.eauction.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eauction.auction.model.Product;
import com.eauction.auction.service.ProductService;
@RestController
public class EauctionSellerController {
	@Autowired
    private ProductService prodService;	
	@PostMapping("/e-auction/api/v1/seller/add-product")    
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(prodService.addProduct(product));
    }

}
