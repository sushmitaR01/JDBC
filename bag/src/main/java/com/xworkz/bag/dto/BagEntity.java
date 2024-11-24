package com.xworkz.bag.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bags_tables")
public class BagEntity {
	@Id
	private int id;
	private int NoOfZips;
	private int NoOfCompartments;
	private double price;
	private double ratings;
	private String reviws ;
	private String name;
	private String colors;
	private String size;
	private String LaptopCompartment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfZips() {
		return NoOfZips;
	}
	public void setNoOfZips(int noOfZips) {
		NoOfZips = noOfZips;
	}
	public int getNoOfCompartments() {
		return NoOfCompartments;
	}
	public void setNoOfCompartments(int noOfCompartments) {
		NoOfCompartments = noOfCompartments;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLaptopCompartment() {
		return LaptopCompartment;
	}
	public void setLaptopCompartment(String laptopCompartment) {
		LaptopCompartment = laptopCompartment;
	}
	
	

}
