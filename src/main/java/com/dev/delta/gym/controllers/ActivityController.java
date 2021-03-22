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

import com.dev.delta.gym.entities.Activity;
import com.dev.delta.gym.service.ActivityService;


@RestController
@RequestMapping("/fastbus/activity")
@CrossOrigin
public class ActivityController {
	@Autowired
	ActivityService activityService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Activity projectActivity, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Activity newPT = activityService.saveOrUpdate(projectActivity);

	        return new ResponseEntity<Activity>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Activity> getAllActivitys()
   {
	   return activityService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Activity> getActivityById(@PathVariable Long id)
   {
	   Activity activity=activityService.findById(id);
	   return new ResponseEntity<Activity>(activity,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteActivity(@PathVariable Long id)
   {
	   activityService.delete(id);
	   return new ResponseEntity<String>("activity was deleted",HttpStatus.OK);
   }
}
