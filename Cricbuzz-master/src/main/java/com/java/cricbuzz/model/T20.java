package com.java.cricbuzz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class T20 {

	@Id
	String id;
	
	String playerName;
	String t20Category;
	String t20Country;
	int t20Rating;
	public T20(String playerName, String t20Category, String t20Country, int t20Rating) {

		this.playerName = playerName;
		this.t20Category = t20Category;
		this.t20Country = t20Country;
		this.t20Rating = t20Rating;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getT20Category() {
		return t20Category;
	}
	public void setT20Category(String t20Category) {
		this.t20Category = t20Category;
	}
	public String getT20Country() {
		return t20Country;
	}
	public void setT20Country(String t20Country) {
		this.t20Country = t20Country;
	}
	public int getT20Rating() {
		return t20Rating;
	}
	public void setT20Rating(int t20Rating) {
		this.t20Rating = t20Rating;
	}
	@Override
	public String toString() {
		return "T20 [playerName=" + playerName + ", t20Category=" + t20Category + ", t20Country=" + t20Country
				+ ", t20Rating=" + t20Rating + "]";
	}
}
