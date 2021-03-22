package com.dev.delta.eventy.controllers;

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

import com.dev.delta.eventy.entities.Event;
import com.dev.delta.eventy.services.EventService;


@RestController
@RequestMapping("/eventy/event")
@CrossOrigin

public class EventController {
	@Autowired
	EventService eventService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Event projectEvent, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Event newPT = eventService.saveOrUpdate(projectEvent);

	        return new ResponseEntity<Event>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Event> getAllEvents()
   {
	   return eventService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Event> getEventById(@PathVariable Long id)
   {
	   Event event=eventService.findById(id);
	   return new ResponseEntity<Event>(event,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteEvent(@PathVariable Long id)
   {
	   eventService.delete(id);
	   return new ResponseEntity<String>("event was deleted",HttpStatus.OK);
   }
}
