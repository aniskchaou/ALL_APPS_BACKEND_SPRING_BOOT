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

import com.dev.delta.fastbus.entities.Offer;
import com.dev.delta.fastbus.service.OfferService;


@RestController
@RequestMapping("/fastbus/offer")
@CrossOrigin
public class OfferController {
	@Autowired
	OfferService offerService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Offer projectOffer, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Offer newPT = offerService.saveOrUpdate(projectOffer);

	        return new ResponseEntity<Offer>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Offer> getAllOffers()
   {
	   return offerService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Offer> getOfferById(@PathVariable Long id)
   {
	   Offer offer=offerService.findById(id);
	   return new ResponseEntity<Offer>(offer,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteOffer(@PathVariable Long id)
   {
	   offerService.delete(id);
	   return new ResponseEntity<String>("offer was deleted",HttpStatus.OK);
   }
}
