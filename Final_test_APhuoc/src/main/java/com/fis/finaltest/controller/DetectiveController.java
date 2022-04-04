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

import com.fis.finaltest.service.DetectiveService;
import com.fis.finaltest.entity.Detective;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/detective")
public class DetectiveController {
    @Autowired
    DetectiveService detectiveService;

    @PostMapping("/save")
    public ResponseEntity<Detective> saveDetective(@RequestBody Detective detective){
    	return ResponseEntity.ok(detectiveService.add(detective));
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Detective> updateDetective(@RequestBody Detective detective, @PathVariable("id") Optional<Long> id){
    	Long detectiveId = id.orElse(null);
    	return ResponseEntity.ok(detectiveService.update(detective,detectiveId));
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Optional<Long> id){
        Long detectiveId = id.orElse(null);
        detectiveService.delete(detectiveId);
        log.info("Detective with id {} deleted", id);
        return new ResponseEntity<String>("Detective deleted successfully.",
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Detective> findById(@PathVariable("id") Optional<Long> id){
        Long detectiveId = id.orElse(null);
        return new ResponseEntity<Detective>(detectiveService.findById(detectiveId),
                HttpStatus.OK);
    }
}