package com.wipro.coe.microservices.data.inventory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.coe.microservices.data.inventory.entity.Warehouse;
import com.wipro.coe.microservices.data.inventory.repository.WarehouseRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WarehouseRestController {

	@Autowired
	WarehouseRepository whr ;
	///warehouse/names
	
	@RequestMapping(value = "/warehouse/names", method = RequestMethod.GET)
	public List<Warehouse> getWarehouseNames(){
		
		return whr.findAll();
		//return null;
		
	}
	
	
}
