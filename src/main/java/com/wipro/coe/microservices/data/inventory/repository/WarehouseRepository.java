package com.wipro.coe.microservices.data.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.coe.microservices.data.inventory.entity.Inventory;
import com.wipro.coe.microservices.data.inventory.entity.Warehouse;

public interface WarehouseRepository extends MongoRepository<Warehouse, String>{
	

}
