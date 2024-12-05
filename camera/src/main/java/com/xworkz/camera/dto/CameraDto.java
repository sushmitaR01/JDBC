package com.xworkz.camera.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="camera_table")
@NamedQuery(name="findByid", query="Select dto From CameraDto dto where dto.id=10")
@NamedQuery(name="findBybrand", query="Select dto From CameraDto dto where dto.brand='sony'")
@NamedQuery(name = "findByprice", query="Select dto From CameraDto dto where dto.price= 9086")
@NamedQuery(name = "findsensortype", query = "Select dto From CameraDto dto Where dto.sensortype ='CMOS'")
@NamedQuery(name= "findByid&Brand", query="Select dto From CameraDto dto Where dto.id=5")

public class CameraDto {
	@Id
	private int id;
	
	private String brand;
	
	private double price;
	
	private String sensortype;
	public CameraDto() {
		// TODO Auto-generated constructor stub
	}
	public CameraDto(int id, String brand, double price, String sensortype) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.sensortype = sensortype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSensortype() {
		return sensortype;
	}
	public void setSensortype(String sensortype) {
		this.sensortype = sensortype;
	}
	@Override
	public String toString() {
		return "CameraDto [id=" + id + ", brand=" + brand + ", price=" + price + ", sensortype=" + sensortype + "]";
	}
	
}
     

