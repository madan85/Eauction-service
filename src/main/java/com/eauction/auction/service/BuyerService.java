package com.eauction.auction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eauction.auction.datarepo.BuyerRepository;
import com.eauction.auction.datarepo.EauctionRepository;
import com.eauction.auction.model.Buyer;
import com.eauction.auction.model.Product;

@Service
public class BuyerService {
	@Autowired
    private BuyerRepository ebuyerRepo;
	public Buyer placeBid(Buyer buyer) {
		return ebuyerRepo.save(buyer);
	}
}
