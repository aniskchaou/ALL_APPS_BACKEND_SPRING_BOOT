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

import com.dev.delta.gym.entities.Groupe;
import com.dev.delta.gym.service.GroupeService;

@RestController
@RequestMapping("/fastbus/groupe")
@CrossOrigin
public class GroupeController {
	@Autowired
	GroupeService groupeService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Groupe projectGroupe, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Groupe newPT = groupeService.saveOrUpdate(projectGroupe);

	        return new ResponseEntity<Groupe>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Groupe> getAllGroupes()
   {
	   return groupeService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Groupe> getGroupeById(@PathVariable Long id)
   {
	   Groupe groupe=groupeService.findById(id);
	   return new ResponseEntity<Groupe>(groupe,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteGroupe(@PathVariable Long id)
   {
	   groupeService.delete(id);
	   return new ResponseEntity<String>("groupe was deleted",HttpStatus.OK);
   }
}
