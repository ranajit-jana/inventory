package com.wipro.coe.microservices.data.inventory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.coe.microservices.data.inventory.entity.Inventory;
import com.wipro.coe.microservices.data.inventory.repository.InventoryRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InventoryRestController {

	@Autowired
	InventoryRepository invr;
	
	///inventory/:facility_id/:item_id/:facility_type/:filter/:filter_value'
	
	@RequestMapping(value = "/inventory/{facility_id}/{item_id}/{facility_type}/{filter}/{filter_value}", method = RequestMethod.GET)
	public List<Inventory> getInventoryWithFilter(@PathVariable("facility_id") String facility_id, 
			                      @PathVariable("item_id") String item_id,
			                      @PathVariable("facility_type") String facility_type ,
			                      @PathVariable("filter") String filter,
			                      @PathVariable("filter_value") String filter_value){
		
//		//return invr.findByFacilityAndItemid(facility_id, item_id );
		if(filter != null && ! filter.isEmpty())
		{
			if( filter.equalsIgnoreCase("Distro_Number")){
				
				return invr.findByFacilityAndItemidAndDistronumber(facility_id, item_id , Integer.valueOf(filter_value).intValue());
				
			} else if( filter.equalsIgnoreCase("ASN_Number")){
				
				return invr.findByFacilityAndItemidAndAsnnumber(facility_id, item_id , Long.valueOf(filter_value).longValue());
			}
			else if(  filter.equalsIgnoreCase("PO_Number")){
				
				return invr.findByFacilityAndItemidAndPonumber(facility_id, item_id , Long.valueOf(filter_value).longValue());
			}
			return invr.findByFacilityAndItemid(facility_id, item_id );
		}
		else 
		{
			return invr.findByFacilityAndItemid(facility_id, item_id );
		}

		
	}
	
	
	///inventory/:facility_id/:item_id/:item_status'
	
	@RequestMapping(value = "/inventory/{facility_id}/{item_id}/{item_status}", method = RequestMethod.GET)
	public List<Inventory> getInventory(@PathVariable("facility_id") String facility_id, 
			                      @PathVariable("item_id") String item_id,
			                      @PathVariable("item_status") String status){
		
		//return invr.findByFacilityAndItemidAndStatusStatusAndStatusQtyGreaterThan (facility_id, item_id , status , 0 );
		return invr.findByFacilityAndItemidAndStatusStatus (facility_id, item_id , status );
	}
}
