package com.fis.spring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.statistic.Statistic;
import com.fis.spring.statistic.StatisticService;

@RestController
public class Api {
	@Autowired
	private StatisticService statisticService;
	
	@GetMapping("/api/statistic")
	public Statistic getStatistic() {
		return statisticService.getStatistic();
		
	}
}
