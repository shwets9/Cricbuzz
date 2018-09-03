package com.java.cricbuzz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ODI")
public class ODI {

	@Id
	String id;
	
	String playerName;
	String odiCategory;
	String odiCountry;
	int odiRating;
	public ODI(String playerName, String odiCategory, String odiCountry, int odiRating) {

		this.playerName = playerName;
		this.odiCategory = odiCategory;
		this.odiCountry = odiCountry;
		this.odiRating = odiRating;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getOdiCategory() {
		return odiCategory;
	}
	public void setOdiCategory(String odiCategory) {
		this.odiCategory = odiCategory;
	}
	public String getOdiCountry() {
		return odiCountry;
	}
	public void setOdiCountry(String odiCountry) {
		this.odiCountry = odiCountry;
	}
	public int getOdiRating() {
		return odiRating;
	}
	public void setOdiRating(int odiRating) {
		this.odiRating = odiRating;
	}
	
	
	@Override
	public String toString() {
		return "ODI [playerName=" + playerName + ", odiCategory=" + odiCategory + ", odiCountry=" + odiCountry
				+ ", odiRating=" + odiRating + "]";
	}
	
	
}
