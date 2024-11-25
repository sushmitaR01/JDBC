package com.xworkz.airpods.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airpods_tables")
public class NeckbandEntity {
	@Id
	private int id;
	private String type;
	private String warranty;
	private double price;
	private double ratings;
	private String reviws ;
	private String name;
	private String colors;
	private String Connectivity;
	private String sustainable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getReviws() {
		return reviws;
	}
	public void setReviws(String reviws) {
		this.reviws = reviws;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getConnectivity() {
		return Connectivity;
	}
	public void setConnectivity(String connectivity) {
		Connectivity = connectivity;
	}
	public String getSustainable() {
		return sustainable;
	}
	public void setSustainable(String sustainable) {
		this.sustainable = sustainable;
	}
	

}
