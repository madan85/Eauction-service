package com.eauction.auction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eauction.auction.datarepo.EauctionRepository;
import com.eauction.auction.model.Product;

@Service
public class ProductService {
	@Autowired
    private EauctionRepository eaucRepo;
	public Product addProduct(Product product) {
	//	System.out.println("First:"+product);
		return eaucRepo.save(product);
	}
	

}
