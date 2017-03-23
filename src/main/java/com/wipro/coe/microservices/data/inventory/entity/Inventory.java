package com.wipro.coe.microservices.data.inventory.entity;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="warehouse_inventories")
public class Inventory {

	@Id
	private String id;
	
	private String facility;
	
	private String itemid;
	
	private String locationid;
	
	private Integer distronumber;
	
	
	private Integer lotnumber;
	
	private Long ponumber;
	
	private Long asnnumber;
	
	private String receiveddate;
	
	private Long supplier;
	
	private List<Status> status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}

	public Integer getDistronumber() {
		return distronumber;
	}

	public void setDistronumber(Integer distronumber) {
		this.distronumber = distronumber;
	}

	public Integer getLotnumber() {
		return lotnumber;
	}

	public void setLotnumber(Integer lotnumber) {
		this.lotnumber = lotnumber;
	}

	public Long getPonumber() {
		return ponumber;
	}

	public void setPonumber(Long ponumber) {
		this.ponumber = ponumber;
	}

	public Long getAsnnumber() {
		return asnnumber;
	}

	public void setAsnnumber(Long asnnumber) {
		this.asnnumber = asnnumber;
	}

	public String getReceiveddate() {
		return receiveddate;
	}

	public void setReceiveddate(String receiveddate) {
		this.receiveddate = receiveddate;
	}

	public Long getSupplier() {
		return supplier;
	}

	public void setSupplier(Long supplier) {
		this.supplier = supplier;
	}

	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}


}
