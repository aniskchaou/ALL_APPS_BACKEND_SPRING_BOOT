package com.dev.delta.gym.controllers;

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

import com.dev.delta.gym.entities.Staff;
import com.dev.delta.gym.service.StaffService;

@RestController
@RequestMapping("/fastbus/staff")
@CrossOrigin
public class StaffController {
	@Autowired
	StaffService staffService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Staff projectStaff, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Staff newPT = staffService.saveOrUpdate(projectStaff);

	        return new ResponseEntity<Staff>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Staff> getAllStaffs()
   {
	   return staffService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Staff> getStaffById(@PathVariable Long id)
   {
	   Staff staff=staffService.findById(id);
	   return new ResponseEntity<Staff>(staff,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteStaff(@PathVariable Long id)
   {
	   staffService.delete(id);
	   return new ResponseEntity<String>("staff was deleted",HttpStatus.OK);
   }
}
