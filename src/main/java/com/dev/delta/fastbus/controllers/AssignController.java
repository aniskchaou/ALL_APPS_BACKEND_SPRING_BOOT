package com.dev.delta.fastbus.controllers;

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

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.fastbus.service.AssignService;

@RestController
@RequestMapping("/fastbus/assign")
@CrossOrigin
public class AssignController {
	@Autowired
	AssignService assignService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Assign projectAssign, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Assign newPT = assignService.saveOrUpdate(projectAssign);

	        return new ResponseEntity<Assign>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Assign> getAllAssigns()
   {
	   return assignService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Assign> getAssignById(@PathVariable Long id)
   {
	   Assign assign=assignService.findById(id);
	   return new ResponseEntity<Assign>(assign,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteAssign(@PathVariable Long id)
   {
	   assignService.delete(id);
	   return new ResponseEntity<String>("assign was deleted",HttpStatus.OK);
   }
}
