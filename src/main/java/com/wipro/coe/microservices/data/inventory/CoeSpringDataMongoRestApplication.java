package com.wipro.coe.microservices.data.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.wipro.coe.microservices.data.inventory.repository.InventoryRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@Slf4j
public class CoeSpringDataMongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoeSpringDataMongoRestApplication.class, args);
	}
	
	@Autowired InventoryRepository inventoryrepository ;
	
	//@Autowired WarehouseRepository warehouseRepository ;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Value("${spring.application.name:coe-mongo-inventory}")
	private String appName;
	
}