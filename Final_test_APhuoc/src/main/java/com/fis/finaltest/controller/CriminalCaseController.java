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

import com.fis.finaltest.service.CriminalCaseService;
import com.fis.finaltest.entity.CriminalCase;

@RestController
@RequestMapping("/criminalcase")
public class CriminalCaseController {
	@Autowired
	CriminalCaseService criminalCaseService;

	@PostMapping("/save")
	public ResponseEntity<CriminalCase> save(@RequestBody CriminalCase case1) {
		return ResponseEntity.ok(criminalCaseService.add(case1));
	}

	@PostMapping("/update/{id}")
	public ResponseEntity<CriminalCase> updateCriminalCase(@RequestBody CriminalCase case1, @PathVariable("id") Optional<Long> id) {
		Long criminalCaseId = id.orElse(null);
		return ResponseEntity.ok(criminalCaseService.update(case1,criminalCaseId));
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteCriminalCase(@PathVariable("id") Optional<Long> id) {
		Long criminalCaseId = id.orElse(null);
		criminalCaseService.delete(criminalCaseId);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CriminalCase> findById(@PathVariable("id") Optional<Long> id) {
		Long criminalCaseId = id.orElse(null);
		return new ResponseEntity<CriminalCase>(criminalCaseService.findById(criminalCaseId), HttpStatus.OK);
	}
}
