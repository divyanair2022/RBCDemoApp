
package com.rbc.stock.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.rbc.stock.model.DowJonesIndex;


public interface DowJonesIndexRepository extends MongoRepository<DowJonesIndex, String>{

	public List<DowJonesIndex> findByQuarter(String quater);
	public List<DowJonesIndex> findByStock(String ticker);

}
