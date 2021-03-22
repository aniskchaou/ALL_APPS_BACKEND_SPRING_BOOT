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

import com.dev.delta.lifecare.entities.ScheduleHospital;
import com.dev.delta.lifecare.services.ScheduleHospitalService;

@RestController
@RequestMapping("/lifecare/schedule")
@CrossOrigin
public class ScheduleHospitalController {
	@Autowired
	ScheduleHospitalService scheduleService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody ScheduleHospital projectSchedule, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        ScheduleHospital newPT = scheduleService.saveOrUpdate(projectSchedule);

	        return new ResponseEntity<ScheduleHospital>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<ScheduleHospital> getAllSchedules()
   {
	   return scheduleService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<ScheduleHospital> getScheduleById(@PathVariable Long id)
   {
	   ScheduleHospital schedule=scheduleService.findById(id);
	   return new ResponseEntity<ScheduleHospital>(schedule,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteSchedule(@PathVariable Long id)
   {
	   scheduleService.delete(id);
	   return new ResponseEntity<String>("schedule was deleted",HttpStatus.OK);
   }
}
