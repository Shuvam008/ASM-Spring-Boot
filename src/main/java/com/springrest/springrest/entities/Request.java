package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Request {
	@Id
	private long id;
	private String equipmenttype;
	private String serialnumber;
	private String location;
	private String supplier;
	private String descriptionlocation;
	private String descriptionvendor;
	private String requestdate;
	private String requesttime;
	private String requestacknowledgedate;
	private String requestacknowledgetime;
	private String requestclosedate;
	private String requestclosetime;
	private String locationapprovedate;
	private String locationapprovetime;
	
	public Request() {}
	
	public Request(long id, String equipmenttype, String serialnumber, String location, String supplier,String descriptionlocation,String descriptionvendor,String requestdate,
			String requesttime, String requestacknowledgedate, String requestacknowledgetime, String requestclosedate,
			String requestclosetime,String locationapprovedate,String locationapprovetime) {
		super();
		this.id = id;
		this.equipmenttype = equipmenttype;
		this.serialnumber = serialnumber;
		this.location = location;
		this.supplier = supplier;
		this.descriptionlocation = descriptionlocation;
		this.descriptionvendor = descriptionvendor;
		this.requestdate = requestdate;
		this.requesttime = requesttime;
		this.requestacknowledgedate = requestacknowledgedate;
		this.requestacknowledgetime = requestacknowledgetime;
		this.requestclosedate = requestclosedate;
		this.requestclosetime = requestclosetime;
		this.locationapprovedate = locationapprovedate;
		this.locationapprovetime = locationapprovetime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEquipmenttype() {
		return equipmenttype;
	}
	public void setEquipmenttype(String equipmenttype) {
		this.equipmenttype = equipmenttype;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(String requestdate) {
		this.requestdate = requestdate;
	}
	public String getRequesttime() {
		return requesttime;
	}
	public void setRequesttime(String requesttime) {
		this.requesttime = requesttime;
	}
	public String getRequestacknowledgedate() {
		return requestacknowledgedate;
	}
	public void setRequestacknowledgedate(String requestacknowledgedate) {
		this.requestacknowledgedate = requestacknowledgedate;
	}
	public String getRequestacknowledgetime() {
		return requestacknowledgetime;
	}
	public void setRequestacknowledgetime(String requestacknowledgetime) {
		this.requestacknowledgetime = requestacknowledgetime;
	}
	public String getRequestclosedate() {
		return requestclosedate;
	}
	public void setRequestclosedate(String requestclosedate) {
		this.requestclosedate = requestclosedate;
	}
	public String getRequestclosetime() {
		return requestclosetime;
	}
	public void setRequestclosetime(String requestclosetime) {
		this.requestclosetime = requestclosetime;
	}
	
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	public String getDescriptionlocation() {
		return descriptionlocation;
	}

	public void setDescriptionlocation(String descriptionlocation) {
		this.descriptionlocation = descriptionlocation;
	}

	public String getDescriptionvendor() {
		return descriptionvendor;
	}

	public void setDescriptionvendor(String descriptionvendor) {
		this.descriptionvendor = descriptionvendor;
	}

	public String getLocationapprovedate() {
		return locationapprovedate;
	}

	public void setLocationapprovedate(String locationapprovedate) {
		this.locationapprovedate = locationapprovedate;
	}

	public String getLocationapprovetime() {
		return locationapprovetime;
	}

	public void setLocationapprovetime(String locationapprovetime) {
		this.locationapprovetime = locationapprovetime;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", equipmenttype=" + equipmenttype + ", serialnumber=" + serialnumber
				+ ", location=" + location + ", supplier=" + supplier + ", descriptionlocation=" + descriptionlocation
				+ ", descriptionvendor=" + descriptionvendor + ", requestdate=" + requestdate + ", requesttime="
				+ requesttime + ", requestacknowledgedate=" + requestacknowledgedate + ", requestacknowledgetime="
				+ requestacknowledgetime + ", requestclosedate=" + requestclosedate + ", requestclosetime="
				+ requestclosetime + ", locationapprovedate=" + locationapprovedate + ", locationapprovetime="
				+ locationapprovetime + "]";
	}
	

}
