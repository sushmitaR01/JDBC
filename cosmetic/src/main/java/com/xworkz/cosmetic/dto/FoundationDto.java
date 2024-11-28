package com.xworkz.cosmetic.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foundation_table")
public class FoundationDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String productName;;

	private int ShadeNo;

	private double price;

	private String type;

	private String Coverage;

	private String Finish;
	private String Preference;

	private String SkinTone;

	private int warranty;
	public FoundationDto() {
		// TODO Auto-generated constructor stub
	}
	public FoundationDto(String productName, int shadeNo, double price, String type, String coverage, String finish,
			String preference, String skinTone, int warranty) {
		super();
		this.productName = productName;
		this.ShadeNo = shadeNo;
		this.price = price;
		this.type = type;
		this.Coverage = coverage;
		this.Finish = finish;
		this.Preference = preference;
		this.SkinTone = skinTone;
		this.warranty = warranty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getShadeNo() {
		return ShadeNo;
	}
	public void setShadeNo(int shadeNo) {
		ShadeNo = shadeNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCoverage() {
		return Coverage;
	}
	public void setCoverage(String coverage) {
		Coverage = coverage;
	}
	public String getFinish() {
		return Finish;
	}
	public void setFinish(String finish) {
		Finish = finish;
	}
	public String getPreference() {
		return Preference;
	}
	public void setPreference(String preference) {
		Preference = preference;
	}
	public String getSkinTone() {
		return SkinTone;
	}
	public void setSkinTone(String skinTone) {
		SkinTone = skinTone;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	

}
