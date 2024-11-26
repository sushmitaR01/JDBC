package com.xworkz.games.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gamess_table")
public class GameDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double ratings;
	private String name;
	private int NoofPlayers;
	public GameDto() {
		
	}

	public GameDto(double ratings, String name, int noofPlayers) {
		super();
		this.ratings = ratings;
		this.name = name;
		NoofPlayers = noofPlayers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoofPlayers() {
		return NoofPlayers;
	}

	public void setNoofPlayers(int noofPlayers) {
		NoofPlayers = noofPlayers;
	}

}
