package com.fis.finaltest.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.fis.finaltest.entity.Detective;

@Service
public interface DetectiveService {

	List<Detective> find(Pageable page);

    Detective add(Detective detective);

    Detective update(Detective detective, Long id);

    void delete(Long id);

    Detective findById(Long id);
}
