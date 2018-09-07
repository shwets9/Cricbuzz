package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Search")
public class Search {
	@Id
	String id;
String playerName;
String national_Side;
String born;
String height;
String batting;
String bowling;
String role;
String test_Runs;
String odi_Runs;
String test_Wickets;
String odi_Wickets;
public Search(String playerName,String national_Side,String born,String height,String batting,String bowling,String role,String test_Runs,String odi_Runs,String test_Wickets,String odi_Wickets) {
	this.playerName=playerName;
	this.national_Side=national_Side;
	this.born=born;
	this.height=height;
	this.batting=batting;
	this.bowling=bowling;
	this.role= role;
	this.test_Runs=test_Runs;
	this.odi_Runs=odi_Runs;
	this.test_Wickets=test_Wickets;
	this.odi_Wickets=odi_Wickets;
	}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getNational_Side() {
	return national_Side;
}
public void setNational_Side(String national_Side) {
	this.national_Side = national_Side;
}
public String getBorn() {
	return born;
}
public void setBorn(String born) {
	this.born = born;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
public String getBatting() {
	return batting;
}
public void setBatting(String batting) {
	this.batting = batting;
}
public String getBowling() {
	return bowling;
}
public void setBowling(String bowling) {
	this.bowling = bowling;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getTest_Runs() {
	return test_Runs;
}
public void setTest_Runs(String test_Runs) {
	this.test_Runs = test_Runs;
}
public String getODI_Runs() {
	return odi_Runs;
}
public void setODI_Runs(String odi_Runs) {
	this.odi_Runs = odi_Runs;
}
public String getTest_Wickets() {
	return test_Wickets;
}
public void setTest_Wickets(String test_Wickets) {
	this.test_Wickets = test_Wickets;
}
public String getODI_Wickets() {
	return odi_Wickets;
}
public void setODI_Wickets(String odi_Wickets) {
	this.odi_Wickets = odi_Wickets;
}
@Override
public String toString() {
	return "Search [id=" + id + ", playerName=" + playerName + ", national_Side=" + national_Side + ", born=" + born
			+ ", height=" + height + ", batting=" + batting + ", bowling=" + bowling + ", role=" + role + ", test_Runs="
			+ test_Runs + ", odi_Runs=" + odi_Runs + ", test_Wickets=" + test_Wickets + ", odi_Wickets=" + odi_Wickets
			+ "]";
}

}




