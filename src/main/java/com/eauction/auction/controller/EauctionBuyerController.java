package com.eauction.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eauction.auction.model.Buyer;
import com.eauction.auction.model.Product;
import com.eauction.auction.service.BuyerService;
import com.eauction.auction.service.ProductService;
@RestController
public class EauctionBuyerController {
	@Autowired
    private BuyerService buyerService;
	
	@PostMapping("/e-auction/api/v1/buyer/place-bid")    
    public ResponseEntity<Buyer> placeBid(@RequestBody Buyer req) {
        return ResponseEntity.ok(buyerService.placeBid(req));
    }

}
