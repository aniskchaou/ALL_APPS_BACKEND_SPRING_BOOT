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

import com.dev.delta.gym.entities.Exercice;
import com.dev.delta.gym.service.ExerciceService;


@RestController
@RequestMapping("/fastbus/exercice")
@CrossOrigin
public class ExerciceController {
	@Autowired
	ExerciceService exerciceService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Exercice projectExercice, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Exercice newPT = exerciceService.saveOrUpdate(projectExercice);

	        return new ResponseEntity<Exercice>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Exercice> getAllExercices()
   {
	   return exerciceService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Exercice> getExerciceById(@PathVariable Long id)
   {
	   Exercice exercice=exerciceService.findById(id);
	   return new ResponseEntity<Exercice>(exercice,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteExercice(@PathVariable Long id)
   {
	   exerciceService.delete(id);
	   return new ResponseEntity<String>("exercice was deleted",HttpStatus.OK);
   }
}
