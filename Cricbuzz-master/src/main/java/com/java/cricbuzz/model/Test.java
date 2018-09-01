package com.java.cricbuzz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Test")
public class Test {

	@Id
	String id;
	
	String playerName;
	String testCategory;
	String testCountry;
	int testRating;
	public Test(String playerName, String testCategory, String testCountry, int testRating) {
		this.playerName = playerName;
		this.testCategory = testCategory;
		this.testCountry = testCountry;
		this.testRating = testRating;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTestCategory() {
		return testCategory;
	}
	public void setTestCategory(String testCategory) {
		this.testCategory = testCategory;
	}
	public String getTestCountry() {
		return testCountry;
	}
	public void setTestCountry(String testCountry) {
		this.testCountry = testCountry;
	}
	public int getTestRating() {
		return testRating;
	}
	public void setTestRating(int testRating) {
		this.testRating = testRating;
	}


	@Override
	public String toString() {
		return "Test [playerName=" + playerName + ", testCategory=" + testCategory + ", testCountry=" + testCountry
				+ ", testRating=" + testRating + "]";
	}
	
}
