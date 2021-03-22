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

import com.dev.delta.gym.entities.EventGYM;
import com.dev.delta.gym.service.EventGYMService;

@RestController
@RequestMapping("/fastbus/event")
@CrossOrigin
public class EventGYMController {
	@Autowired
	EventGYMService eventService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody EventGYM projectEvent, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        EventGYM newPT = eventService.saveOrUpdate(projectEvent);

	        return new ResponseEntity<EventGYM>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<EventGYM> getAllEvents()
   {
	   return eventService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<EventGYM> getEventById(@PathVariable Long id)
   {
	   EventGYM event=eventService.findById(id);
	   return new ResponseEntity<EventGYM>(event,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteEvent(@PathVariable Long id)
   {
	   eventService.delete(id);
	   return new ResponseEntity<String>("event was deleted",HttpStatus.OK);
   }
}
