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

import com.dev.delta.fastbus.entities.Booking;
import com.dev.delta.fastbus.service.BookingService;
@RestController
@RequestMapping("/fastbus/booking")
@CrossOrigin
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Booking projectBooking, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Booking newPT = bookingService.saveOrUpdate(projectBooking);

	        return new ResponseEntity<Booking>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Booking> getAllBookings()
   {
	   return bookingService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Booking> getBookingById(@PathVariable Long id)
   {
	   Booking booking=bookingService.findById(id);
	   return new ResponseEntity<Booking>(booking,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteBooking(@PathVariable Long id)
   {
	   bookingService.delete(id);
	   return new ResponseEntity<String>("booking was deleted",HttpStatus.OK);
   }
}
