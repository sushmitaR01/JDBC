package com.xworkz.organization.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "organizations_table")
@NamedQuery(name = "findByProfessorId", query = "Select ie from InstituteEntity ie where ie.professorId= :profId")
@NamedQuery(name = "findAll", query = "Select ie from InstituteEntity ie")
@NamedQuery(name = "findNameByEmail", query = "Select ie.name from InstituteEntity ie where ie.email= : getEmail")
@NamedQuery(name = "findSalaryById", query = "Select ie.salary From InstituteEntity ie where ie.id = :setId")
@NamedQuery(name = "findOfficeNoByName", query = "Select ie.officeNo from InstituteEntity ie where ie.name= :setName")
public class OrganizationEntity {
	@Id

	private int id;
	@Column(name = "prof_id")
	private int professorId;

	private String name;

	private String email;

	private String department;

	private long officeNo;

	private double salary;
	public OrganizationEntity() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getOfficeNo() {
		return officeNo;
	}
	public void setOfficeNo(long officeNo) {
		this.officeNo = officeNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public OrganizationEntity(int id, int professorId, String name, String email, String department, long officeNo,
			double salary) {
		super();
		this.id = id;
		this.professorId = professorId;
		this.name = name;
		this.email = email;
		this.department = department;
		this.officeNo = officeNo;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "OrganizationEntity [id=" + id + ", professorId=" + professorId + ", name=" + name + ", email=" + email
				+ ", department=" + department + ", officeNo=" + officeNo + ", salary=" + salary + "]";
	}
	

}
