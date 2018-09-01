package com.java.cricbuzz.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="series")
public class Series {
	
	@Id
	String Id;
	
	String seriesName;
	String teamsPlaying;
	String seriesMatches;
	String seriesDate;
	public Series(String seriesName, String teamsPlaying, String seriesMatches, String seriesDate) {

		this.seriesName = seriesName;
		this.teamsPlaying = teamsPlaying;
		this.seriesMatches = seriesMatches;
		this.seriesDate = seriesDate;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getTeamsPlaying() {
		return teamsPlaying;
	}
	public void setTeamsPlaying(String teamsPlaying) {
		this.teamsPlaying = teamsPlaying;
	}
	public String getSeriesMatches() {
		return seriesMatches;
	}
	public void setSeriesMatches(String seriesMatches) {
		this.seriesMatches = seriesMatches;
	}
	public String getSeriesDate() {
		return seriesDate;
	}
	public void setSeriesDate(String seriesDate) {
		this.seriesDate = seriesDate;
	}
	@Override
	public String toString() {
		return "Series [seriesName=" + seriesName + ", teamsPlaying=" + teamsPlaying + ", seriesMatches="
				+ seriesMatches + ", seriesDate=" + seriesDate + "]";
	}

}