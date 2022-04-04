package com.fis.finaltest.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.fis.finaltest.entity.CriminalCase;

@Service
public interface CriminalCaseService {

	List<CriminalCase> find(Pageable page);

	CriminalCase add(CriminalCase criminalCase);

	CriminalCase update(CriminalCase criminalCase, Long id);

	void delete(Long id);

	CriminalCase findById(Long id);
}
