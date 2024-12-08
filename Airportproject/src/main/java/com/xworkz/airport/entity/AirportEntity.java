package com.xworkz.airport.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "useres_table")
@NamedQuery(name="findAll", query ="SELECT a FROM AirportEntity a")
@NamedQuery(name="updateNameByphoneNo" , query = "UPDATE AirportEntity a SET a.name = :name WHERE a.phoneNo = :phoneNo")
@NamedQuery(name="updatephoneNoByalive" , query = "UPDATE AirportEntity a SET a.phoneNo = :phoneNo WHERE a.alive = :alive")
@NamedQuery(name="findsourceAnddestinationById" , query = "SELECT u.source, u.destination FROM AirportEntity u WHERE u.id = :id")
@NamedQuery(name="countBygenderAndAge" , query = "SELECT COUNT(p) FROM AirportEntity p WHERE p.gender = :gender AND p.age = :age")
@NamedQuery(name="countByAgeGreaterThan15" , query = "SELECT COUNT(p) FROM AirportEntity p WHERE p.age > 15")
@NamedQuery(name="findNameAndageAndphoneNoByid" , query = "SELECT p.name, p.age, p.phoneNo FROM AirportEntity p WHERE p.id = :id")
@NamedQuery(name="findAllByAddressAndPhoneNo" , query = "SELECT p FROM AirportEntity p WHERE p.address = :address AND p.phoneNo = :phoneNo")
@NamedQuery(name="deleteByNameAndAge" , query = "DELETE FROM AirportEntity p WHERE p.name = :name AND p.age = :age")
@NamedQuery(name="findByTwoConditions" , query = "SELECT p.id,p.name, p.age, p.phoneNo,p.rating,p.source, p.destination,p.gender,p.address FROM AirportEntity p WHERE p.condition1 = :condition1 AND p.condition2 = :condition2")

public class AirportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private int id;
	private String name;
	private long phoneNo;
	private int age;
	private short rating;
	private boolean alive;
	private String source;
	private String destination;
	private char gender;
	private String address;
	public AirportEntity() {
		// TODO Auto-generated constructor stub
	}
	public AirportEntity(String name, long phoneNo, int age, short rating, boolean alive, String source,
			String destination, char gender, String address) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.rating = rating;
		this.alive = alive;
		this.source = source;
		this.destination = destination;
		this.gender = gender;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", rating="
				+ rating + ", alive=" + alive + ", source=" + source + ", destination=" + destination + ", gender="
				+ gender + ", address=" + address + "]";
	}
	
}
