package com.fis.finaltest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.Evidence;
import com.fis.finaltest.repo.EvidenceRepo;
import com.fis.finaltest.service.EvidenceService;
@Service
public class EvidenceServiceImpl implements EvidenceService{

	@Autowired
    EvidenceRepo evidenceRepo;
	
	@Override
	public List<Evidence> find(Pageable page) {
		return evidenceRepo.findAll(page).getContent();
	}

	@Override
	public Evidence add(Evidence evidence) {
		return evidenceRepo.save(evidence);
	}

	@Override
	public Evidence update(Evidence evidence, Long id) {
		Evidence evidence2 = evidenceRepo.save(evidence);
		return evidence2;
	}

	@Override
	public void delete(Long id) {
		evidenceRepo.deleteById(id);
		
	}

	@Override
	public Evidence findById(Long id) {
		return evidenceRepo.findById(id).orElse(null);
	}

}
