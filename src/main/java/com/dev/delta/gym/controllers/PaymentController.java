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

import com.dev.delta.gym.entities.PaymentGYM;
import com.dev.delta.gym.service.PaymentService;

@RestController
@RequestMapping("/fastbus/payment")
@CrossOrigin
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody PaymentGYM projectPayment, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        PaymentGYM newPT = paymentService.saveOrUpdate(projectPayment);

	        return new ResponseEntity<PaymentGYM>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<PaymentGYM> getAllPayments()
   {
	   return paymentService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<PaymentGYM> getPaymentById(@PathVariable Long id)
   {
	   PaymentGYM payment=paymentService.findById(id);
	   return new ResponseEntity<PaymentGYM>(payment,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePayment(@PathVariable Long id)
   {
	   paymentService.delete(id);
	   return new ResponseEntity<String>("payment was deleted",HttpStatus.OK);
   }
}
