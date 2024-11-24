package com.xworkz.watch.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watchs_tables")
public class WatchEntity {
	@Id
	private int id;
	private double price;
	private double ratings;
	private String reviws ;
	private String name;
	private String colors;
	private String WaterResistance;
	private String Material;
	private String Displays;
	private String PowderSource;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getWaterResistance() {
		return WaterResistance;
	}
	public void setWaterResistance(String waterResistance) {
		WaterResistance = waterResistance;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getDisplays() {
		return Displays;
	}
	public void setDisplays(String displays) {
		Displays = displays;
	}
	public String getPowderSource() {
		return PowderSource;
	}
	public void setPowderSource(String powderSource) {
		PowderSource = powderSource;
	}
	
		
	}


