package com.dev.delta.accountt.controllers;

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

import com.dev.delta.accountt.entities.Client;
import com.dev.delta.accountt.services.ClientService;
@RestController
@RequestMapping("/client")
@CrossOrigin
public class ClientController {
	@Autowired
	ClientService clientService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Client projectClient, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Client newPT = clientService.saveOrUpdate(projectClient);

	        return new ResponseEntity<Client>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Client> getAllClients()
   {
	   return clientService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Client> getClientById(@PathVariable Long id)
   {
	   Client client=clientService.findById(id);
	   return new ResponseEntity<Client>(client,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteClient(@PathVariable Long id)
   {
	   clientService.delete(id);
	   return new ResponseEntity<String>("client was deleted",HttpStatus.OK);
   }
}
