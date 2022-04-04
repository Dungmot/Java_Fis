package com.fis.finaltest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.CriminalCase;
import com.fis.finaltest.entity.Detective;
import com.fis.finaltest.repo.DetectiveRepo;
import com.fis.finaltest.service.DetectiveService;

@Service
public class DetectiveServiceImpl implements DetectiveService{

	@Autowired
    DetectiveRepo detectiveRepo;
	
	@Override
	public List<Detective> find(Pageable page) {
		return detectiveRepo.findAll(page).getContent();
	}

	@Override
	public Detective add(Detective detective) {
		return detectiveRepo.save(detective);
	}

	@Override
	public Detective update(Detective detective, Long id) {
		Detective detective2 = detectiveRepo.save(detective);
		return detective2;
	}

	@Override
	public void delete(Long id) {
		detectiveRepo.deleteById(id);
		
	}

	@Override
	public Detective findById(Long id) {
		return detectiveRepo.findById(id).orElse(null);
	}

}
