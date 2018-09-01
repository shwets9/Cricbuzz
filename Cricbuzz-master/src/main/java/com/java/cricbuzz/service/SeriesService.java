package com.java.cricbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cricbuzz.model.Series;
import com.java.cricbuzz.repository.SeriesRepository;

@Service
public class SeriesService {
	@Autowired
	private SeriesRepository seriesRepository;
	
	public List<Series> getAllSeries()
	{
		return seriesRepository.findAll();
	}
}
