package com.fis.spring.statistic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {

	@Autowired
	private StatisticRepository repo;
	
	public Statistic getStatistic() {
		return repo.getStatistic();
	}
}
