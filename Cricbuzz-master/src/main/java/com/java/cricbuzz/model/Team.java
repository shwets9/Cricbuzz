package com.java.cricbuzz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="team")
public class Team {
	
	@Id
	String id;
	String teamName;
	int odiRating;
	int t20Rating;
	int testRating;
	public Team(String teamName, int odiRating, int t20Rating, int testRating) {
		this.teamName = teamName;
		this.odiRating = odiRating;
		this.t20Rating = t20Rating;
		this.testRating = testRating;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getOdiRating() {
		return odiRating;
	}
	public void setOdiRating(int odiRating) {
		this.odiRating = odiRating;
	}
	public int getT20Rating() {
		return t20Rating;
	}
	public void setT20Rating(int t20Rating) {
		this.t20Rating = t20Rating;
	}
	public int getTestRating() {
		return testRating;
	}
	public void setTestRating(int testRating) {
		this.testRating = testRating;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", odiRating=" + odiRating + ", t20Rating=" + t20Rating + ", testRating="
				+ testRating + "]";
	}
}
