package com.xworkz.animations.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="animi_tables")
public class AnimaEntity {
	@Id
	private int id;
	private int seasons;
	private int NoOfCharacters;
	private double versions;
	private double ratings;
	private double price;
	private String name;
	private String theams;
	private String AdultFocus;
	private String LengthOfEpisodes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getNoOfCharacters() {
		return NoOfCharacters;
	}
	public void setNoOfCharacters(int noOfCharacters) {
		NoOfCharacters = noOfCharacters;
	}
	public double getVersions() {
		return versions;
	}
	public void setVersions(double versions) {
		this.versions = versions;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheams() {
		return theams;
	}
	public void setTheams(String theams) {
		this.theams = theams;
	}
	public String getAdultFocus() {
		return AdultFocus;
	}
	public void setAdultFocus(String adultFocus) {
		AdultFocus = adultFocus;
	}
	public String getLengthOfEpisodes() {
		return LengthOfEpisodes;
	}
	public void setLengthOfEpisodes(String lengthOfEpisodes) {
		LengthOfEpisodes = lengthOfEpisodes;
	}
	
	
	
	
	
	
	
	

}
