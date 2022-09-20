package com.rbc.stock.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rbc.stock.model.Stock;

public interface StockRepository extends MongoRepository<Stock, String> {

	public Stock findByTicker(String name);
	public List<Stock> findByName(String ticker);

}
