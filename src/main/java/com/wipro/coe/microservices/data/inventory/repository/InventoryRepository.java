package com.wipro.coe.microservices.data.inventory.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wipro.coe.microservices.data.inventory.entity.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String>{
	
	
	public List<Inventory> findByFacilityAndItemid ( String facility, String itemid );
	
	public List<Inventory> findByFacilityAndItemidAndDistronumber( String facility, String itemid, Integer distronumber );
	
	public List<Inventory> findByFacilityAndItemidAndAsnnumber( String facility, String itemid, Long ASNNumber );
	
	public List<Inventory> findByFacilityAndItemidAndPonumber( String facility, String itemid, Long PONumber );
	
	@Query(value = "{ 'facility' : ?0, 'itemid' : ?1 , 'status.status' : ?2 , 'status.qty' : ?3}", fields = "{ 'status.status' : 2 , 'status.qty' : 3}")
	public List<Inventory> findByFacilityAndItemidAndStatusStatusAndStatusQtyGreaterThan( String facility_id, String item_id,  String status, Integer qty);
	
	@Query(value = "{ 'facility' : ?0, 'itemid' : ?1 , 'status.status' : ?2 }")
	public List<Inventory> findByFacilityAndItemidAndStatusStatus( String facility_id, String item_id,  String status);
	
	
//	@Query
//	public List<Inventory> findByFacility_NameAndItem_IDAndItemStatus(Long facility_id, 
//			                      Long item_id,
//			                      String item_status);
//	
//	
//	
//	//return invr.findByFacility_NameAndItem_IDAndDistro_Number;
//			//return invr.findByFacility_NameAndItem_IDAndPO_Number;
//			//return invr.findByFacility_NameAndItem_IDAndASN_Number;
//    @Query
//	public List<Inventory> findByFacility_NameAndItem_IDAndDistro_Number(Long facility_id, 
//			                      Long item_id,
//			                      Long distro_number);
//    
//    
//    
//    @Query
//  	public List<Inventory> findByFacility_NameAndItem_IDAndPO_Number(Long facility_id, 
//  			                      Long item_id,
//  			                      Long PO_Number);
//
//
//    @Query
//  	public List<Inventory> findByFacility_NameAndItem_IDAndASN_Number(Long facility_id, 
//  			                      Long itemid,
//  			                      Long ASN_Number);

}
