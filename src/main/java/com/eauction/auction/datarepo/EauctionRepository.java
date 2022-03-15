package com.eauction.auction.datarepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eauction.auction.model.Product;
@Repository
public interface EauctionRepository extends MongoRepository<Product, String> {

}
