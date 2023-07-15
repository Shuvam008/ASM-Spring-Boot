package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Asset {
	@Id
	private long id;
	private String equipmenttype;
	private String make;
	private String serialnumber;
	private int    subassetnumber;
	private String suppliedto;
	private String ponumber;
	private String purchasedate;
	private String supplier;
	private String supplytostationdate;
	private String warrantyexpired;
	private String codallife;
	private String codallifeexpired;
	private String warranty;
	private String amc;
	private String purchasefrom;
	private String fund;
	private String suppliermail;
	private String supplierphonenumber;
	
	public Asset() {}
	
	public Asset(long id, String equipmenttype, String make, String serialnumber, int subassetnumber, String suppliedto,
			String ponumber, String purchasedate, String supplier, String supplytostationdate, String warrantyexpired,
			String codallife, String codallifeexpired,String warranty, String amc, String purchasefrom, String fund, String suppliermail,
			String supplierphonenumber) {
		super();
		this.id = id;
		this.equipmenttype = equipmenttype;
		this.make = make;
		this.serialnumber = serialnumber;
		this.subassetnumber = subassetnumber;
		this.suppliedto = suppliedto;
		this.ponumber = ponumber;
		this.purchasedate = purchasedate;
		this.supplier = supplier;
		this.supplytostationdate = supplytostationdate;
		this.warrantyexpired = warrantyexpired;
		this.codallife = codallife;
		this.codallifeexpired = codallifeexpired;
		this.warranty = warranty;
		this.amc = amc;
		this.purchasefrom = purchasefrom;
		this.fund = fund;
		this.suppliermail = suppliermail;
		this.supplierphonenumber = supplierphonenumber;
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
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public int getSubassetnumber() {
		return subassetnumber;
	}
	public void setSubassetnumber(int subassetnumber) {
		this.subassetnumber = subassetnumber;
	}
	public String getSuppliedto() {
		return suppliedto;
	}
	public void setSuppliedto(String suppliedto) {
		this.suppliedto = suppliedto;
	}
	public String getPonumber() {
		return ponumber;
	}
	public void setPonumber(String ponumber) {
		this.ponumber = ponumber;
	}
	public String getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplytostationdate() {
		return supplytostationdate;
	}
	public void setSupplytostationdate(String supplytostationdate) {
		this.supplytostationdate = supplytostationdate;
	}
	public String getWarrantyexpired() {
		return warrantyexpired;
	}
	public void setWarrantyexpired(String warrantyexpired) {
		this.warrantyexpired = warrantyexpired;
	}
	public String getCodallife() {
		return codallife;
	}
	public void setCodallife(String codallife) {
		this.codallife = codallife;
	}
	public String getCodallifeexpired() {
		return codallifeexpired;
	}
	public void setCodallifeexpired(String codallifeexpired) {
		this.codallifeexpired = codallifeexpired;
	}
	
	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getAmc() {
		return amc;
	}

	public void setAmc(String amc) {
		this.amc = amc;
	}

	public String getPurchasefrom() {
		return purchasefrom;
	}
	public void setPurchasefrom(String purchasefrom) {
		this.purchasefrom = purchasefrom;
	}
	public String getFund() {
		return fund;
	}
	public void setFund(String fund) {
		this.fund = fund;
	}
	public String getSuppliermail() {
		return suppliermail;
	}
	public void setSuppliermail(String suppliermail) {
		this.suppliermail = suppliermail;
	}
	public String getSupplierphonenumber() {
		return supplierphonenumber;
	}
	public void setSupplierphonenumber(String supplierphonenumber) {
		this.supplierphonenumber = supplierphonenumber;
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", equipmenttype=" + equipmenttype + ", make=" + make + ", serialnumber="
				+ serialnumber + ", subassetnumber=" + subassetnumber + ", suppliedto=" + suppliedto + ", ponumber="
				+ ponumber + ", purchasedate=" + purchasedate + ", supplier=" + supplier + ", supplytostationdate="
				+ supplytostationdate + ", warrantyexpired=" + warrantyexpired + ", codallife=" + codallife
				+ ", codallifeexpired=" + codallifeexpired + ", warranty=" + warranty + ", amc=" + amc
				+ ", purchasefrom=" + purchasefrom + ", fund=" + fund + ", suppliermail=" + suppliermail
				+ ", supplierphonenumber=" + supplierphonenumber + "]";
	}
	
	
	
	
}
