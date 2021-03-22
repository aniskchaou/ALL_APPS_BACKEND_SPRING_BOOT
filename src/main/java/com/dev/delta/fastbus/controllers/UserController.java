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

import com.dev.delta.eventy.entities.UserEvent;
import com.dev.delta.eventy.services.UserService;
@RestController
@RequestMapping("/fastbus/user")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody UserEvent projectUser, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        UserEvent newPT = userService.saveOrUpdate(projectUser);

	        return new ResponseEntity<UserEvent>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<UserEvent> getAllUsers()
   {
	   return userService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<UserEvent> getUserById(@PathVariable Long id)
   {
	   UserEvent user=userService.findById(id);
	   return new ResponseEntity<UserEvent>(user,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteUser(@PathVariable Long id)
   {
	   userService.delete(id);
	   return new ResponseEntity<String>("user was deleted",HttpStatus.OK);
   }
}
