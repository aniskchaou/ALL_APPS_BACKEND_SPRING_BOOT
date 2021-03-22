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

import com.dev.delta.uprecruit.entities.Interview;
import com.dev.delta.uprecruit.services.InterviewService;

@RestController
@RequestMapping("/uprecruit/interview")
@CrossOrigin
public class InterviewController {
	@Autowired
	InterviewService interviewService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Interview projectInterview, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Interview newPT = interviewService.saveOrUpdate(projectInterview);

	        return new ResponseEntity<Interview>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Interview> getAllInterviews()
   {
	   return interviewService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Interview> getInterviewById(@PathVariable Long id)
   {
	   Interview interview=interviewService.findById(id);
	   return new ResponseEntity<Interview>(interview,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteInterview(@PathVariable Long id)
   {
	   interviewService.delete(id);
	   return new ResponseEntity<String>("interview was deleted",HttpStatus.OK);
   }
}
