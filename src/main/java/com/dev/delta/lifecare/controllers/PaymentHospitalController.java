package com.dev.delta.lifecare.controllers;

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

import com.dev.delta.lifecare.entities.PaymentHospial;
import com.dev.delta.lifecare.services.PaymentHospitalService;


@RestController
@RequestMapping("/lifecare/payment")
@CrossOrigin
public class PaymentHospitalController {
	@Autowired
	PaymentHospitalService paymentService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody PaymentHospial projectPayment, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        PaymentHospial newPT = paymentService.saveOrUpdate(projectPayment);

	        return new ResponseEntity<PaymentHospial>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<PaymentHospial> getAllPayments()
   {
	   return paymentService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<PaymentHospial> getPaymentById(@PathVariable Long id)
   {
	   PaymentHospial payment=paymentService.findById(id);
	   return new ResponseEntity<PaymentHospial>(payment,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deletePayment(@PathVariable Long id)
   {
	   paymentService.delete(id);
	   return new ResponseEntity<String>("payment was deleted",HttpStatus.OK);
   }
}
