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

import com.dev.delta.fastbus.entities.Route;
import com.dev.delta.fastbus.service.RouteService;

@RestController
@RequestMapping("/fastbus/route")
@CrossOrigin
public class RouteController {
	@Autowired
	RouteService routeService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Route projectRoute, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Route newPT = routeService.saveOrUpdate(projectRoute);

	        return new ResponseEntity<Route>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Route> getAllRoutes()
   {
	   return routeService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Route> getRouteById(@PathVariable Long id)
   {
	   Route route=routeService.findById(id);
	   return new ResponseEntity<Route>(route,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteRoute(@PathVariable Long id)
   {
	   routeService.delete(id);
	   return new ResponseEntity<String>("route was deleted",HttpStatus.OK);
   }
}
