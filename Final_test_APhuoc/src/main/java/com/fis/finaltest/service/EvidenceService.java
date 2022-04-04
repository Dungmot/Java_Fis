package com.fis.finaltest.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.Evidence;

@Service
public interface EvidenceService {
	List<Evidence> find(Pageable page);

    Evidence add(Evidence evidence);

    Evidence update(Evidence evidence, Long id);

    void delete(Long id);

    Evidence findById(Long id);
}
