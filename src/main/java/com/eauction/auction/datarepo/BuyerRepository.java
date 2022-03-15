package com.eauction.auction.datarepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eauction.auction.model.Buyer;
import com.eauction.auction.model.Product;
@Repository
public interface BuyerRepository extends MongoRepository<Buyer, String> {

}
