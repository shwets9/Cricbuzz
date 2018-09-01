package com.java.cricbuzz.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dateTest")
public class DateTesting {
	@Id
	String id;
	
	Date date;
	String Description;

	public DateTesting(Date date, String Description) {
		this.date = date;
		this.Description=Description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@Override
	public String toString() {
		return "DateTesting [id=" + id + ", date=" + date + ", description=" + Description + "]";
	}

	
}
