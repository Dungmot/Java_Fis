package com.fis.finaltest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.CriminalCase;
import com.fis.finaltest.repo.CriminalCaseRepo;
import com.fis.finaltest.service.CriminalCaseService;

@Service
public class CriminalCaseServiceImpl implements CriminalCaseService{

	@Autowired
	private CriminalCaseRepo caseRepo;
	
	@Override
	public List<CriminalCase> find(Pageable page) {
		return caseRepo.findAll(page).getContent();
	}

	@Override
	public CriminalCase add(CriminalCase criminalCase) {
		return caseRepo.save(criminalCase);
	}

	@Override
	public CriminalCase update(CriminalCase criminalCase, Long id) {
		CriminalCase case1 = caseRepo.save(criminalCase);
		return case1;
	}

	@Override
	public void delete(Long id) {
		caseRepo.deleteById(id);
		
	}

	@Override
	public CriminalCase findById(Long id) {
		return caseRepo.findById(id).orElse(null);
	}

	
}
