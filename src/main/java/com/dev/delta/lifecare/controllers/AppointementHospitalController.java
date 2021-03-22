package com.dev.delta.lifecare.controllers;

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

import com.dev.delta.lifecare.entities.AppointementHospital;
import com.dev.delta.lifecare.services.AppointementHospitalService;

@RestController
@RequestMapping("/lifecare/appointement")
@CrossOrigin
public class AppointementHospitalController {
	@Autowired
	AppointementHospitalService appointementService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody AppointementHospital projectAppointement, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        AppointementHospital newPT = appointementService.saveOrUpdate(projectAppointement);

	        return new ResponseEntity<AppointementHospital>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<AppointementHospital> getAllAppointements()
   {
	   return appointementService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<AppointementHospital> getAppointementById(@PathVariable Long id)
   {
	   AppointementHospital appointement=appointementService.findById(id);
	   return new ResponseEntity<AppointementHospital>(appointement,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteAppointement(@PathVariable Long id)
   {
	   appointementService.delete(id);
	   return new ResponseEntity<String>("appointement was deleted",HttpStatus.OK);
   }
}
