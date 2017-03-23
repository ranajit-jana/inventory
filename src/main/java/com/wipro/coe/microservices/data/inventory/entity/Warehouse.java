package com.wipro.coe.microservices.data.inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="warehouses")
public class Warehouse {


	@Id
	private String id;

	private String Warehouse_ID;
	
	private String Warehouse_Name;
	
	private String Warehouse_Type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWarehouse_ID() {
		return Warehouse_ID;
	}

	public void setWarehouse_ID(String warehouse_ID) {
		Warehouse_ID = warehouse_ID;
	}

	public String getWarehouse_Name() {
		return Warehouse_Name;
	}

	public void setWarehouse_Name(String warehouse_Name) {
		Warehouse_Name = warehouse_Name;
	}

	public String getWarehouse_Type() {
		return Warehouse_Type;
	}

	public void setWarehouse_Type(String warehouse_Type) {
		Warehouse_Type = warehouse_Type;
	}
	
	
	
}
