package com.xworkz.student.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
@NamedQuery(name="findByid", query="Select dto From StudentDto dto where dto.id=10")
@NamedQuery(name="findByname", query="Select dto From StudentDto dto where dto.name='Gunashree'")
@NamedQuery(name = "findByaddress", query="Select dto From StudentDto dto where dto.address= 'Mahalaxmi layout'")
@NamedQuery(name = "findage", query = "Select dto From StudentDto dto Where dto.age = 23")
@NamedQuery(name= "findByemail", query="Select dto From StudentDto dto Where dto.email='Laxmi.@example.com'")
public class StudentDto {
	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	private int age;
	private String email;
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age
				+ ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phone ^ (phone >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDto other = (StudentDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		return true;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentDto(int id, String name, String address, long phone, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.email = email;
	}
	

}
