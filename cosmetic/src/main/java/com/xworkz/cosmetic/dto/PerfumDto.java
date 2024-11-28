package com.xworkz.cosmetic.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfum_table")
public class PerfumDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String productName;;

	private String size;

	private double price;

	private String type;

	private String Strength;

	private String TopNote;
	private String ProductDetail;

	private int rating;

	private int warranty;
	public PerfumDto() {
		// TODO Auto-generated constructor stub
	}
	public PerfumDto(String productName, String size, double price, String type, String strength, String topNote,
			String productDetail, int rating, int warranty) {
		super();
		this.productName = productName;
		this.size = size;
		this.price = price;
		this.type = type;
		this.Strength = strength;
		this.TopNote = topNote;
		this.ProductDetail = productDetail;
		this.rating = rating;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
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
	public String getStrength() {
		return Strength;
	}
	public void setStrength(String strength) {
		Strength = strength;
	}
	public String getTopNote() {
		return TopNote;
	}
	public void setTopNote(String topNote) {
		TopNote = topNote;
	}
	public String getProductDetail() {
		return ProductDetail;
	}
	public void setProductDetail(String productDetail) {
		ProductDetail = productDetail;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	

}
