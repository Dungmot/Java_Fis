package com.fis.finaltest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.finaltest.service.EvidenceService;
import com.fis.finaltest.entity.Evidence;

@RestController
@RequestMapping("/evidence")
public class EvidenceController {
	@Autowired
	EvidenceService evidenceService;

	@PostMapping("/save")
	public ResponseEntity<Evidence> add(@RequestBody Evidence evidence) {
		return ResponseEntity.ok(evidenceService.add(evidence));
	}

	@PostMapping("/update/{id}")
	public ResponseEntity<Evidence> upate(@RequestBody Evidence evidence, @PathVariable("id") Optional<Long> id) {
		Long evidenceId = id.orElse(null);
		return ResponseEntity.ok(evidenceService.update(evidence,evidenceId));
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteEvidence(@PathVariable("id") Optional<Long> id) {
		Long evidenceId = id.orElse(null);
		evidenceService.delete(evidenceId);
		return new ResponseEntity<String>("Deleted successfully.", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Evidence> findEvidenceById(@PathVariable("id") Optional<Long> id) {
		Long evidenceId = id.orElse(null);
		return new ResponseEntity<Evidence>(evidenceService.findById(evidenceId), HttpStatus.OK);
	}
}
