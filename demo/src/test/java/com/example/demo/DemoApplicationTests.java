package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rbc.stock.repository.DowJonesIndexRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	DowJonesIndexRepository repository;
	
	@BeforeEach
	public void setUp() {
		repository.deleteAll();
	}

}
