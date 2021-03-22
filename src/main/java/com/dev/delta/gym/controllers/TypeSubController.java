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

import com.dev.delta.gym.entities.TypeSub;
import com.dev.delta.gym.service.TypeSubService;

@RestController
@RequestMapping("/gym/typesub")
@CrossOrigin
public class TypeSubController {
	@Autowired
	TypeSubService typeSubService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody TypeSub projectTypeSub, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        TypeSub newPT = typeSubService.saveOrUpdate(projectTypeSub);

	        return new ResponseEntity<TypeSub>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<TypeSub> getAllTypeSubs()
   {
	   return typeSubService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<TypeSub> getTypeSubById(@PathVariable Long id)
   {
	   TypeSub typeSub=typeSubService.findById(id);
	   return new ResponseEntity<TypeSub>(typeSub,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteTypeSub(@PathVariable Long id)
   {
	   typeSubService.delete(id);
	   return new ResponseEntity<String>("typeSub was deleted",HttpStatus.OK);
   }
}
