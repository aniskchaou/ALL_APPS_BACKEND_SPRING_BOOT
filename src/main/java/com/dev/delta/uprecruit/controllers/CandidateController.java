package com.dev.delta.uprecruit.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.uprecruit.entities.Candidate;
import com.dev.delta.uprecruit.services.CandidateService;

@RestController
@RequestMapping("/uprecruit/candidate")
@CrossOrigin
public class CandidateController {
	@Autowired
	CandidateService candidateService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Candidate projectCandidate, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Candidate newPT = candidateService.saveOrUpdate(projectCandidate);

	        return new ResponseEntity<Candidate>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Candidate> getAllCandidates()
   {
	   return candidateService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Candidate> getCandidateById(@PathVariable Long id)
   {
	   Candidate candidate=candidateService.findById(id);
	   return new ResponseEntity<Candidate>(candidate,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteCandidate(@PathVariable Long id)
   {
	   candidateService.delete(id);
	   return new ResponseEntity<String>("candidate was deleted",HttpStatus.OK);
   }
}
