package com.dev.delta.dentic.controllers;

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

import com.dev.delta.dentic.entities.Medicament;
import com.dev.delta.dentic.services.MedicamentService;


@RestController
@RequestMapping("/medicament")
@CrossOrigin
public class MedicamentController {
	@Autowired
	MedicamentService medicamentService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Medicament projectMedicament, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Medicament newPT = medicamentService.saveOrUpdate(projectMedicament);

	        return new ResponseEntity<Medicament>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Medicament> getAllMedicaments()
   {
	   return medicamentService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Medicament> getMedicamentById(@PathVariable Long id)
   {
	   Medicament medicament=medicamentService.findById(id);
	   return new ResponseEntity<Medicament>(medicament,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteMedicament(@PathVariable Long id)
   {
	   medicamentService.delete(id);
	   return new ResponseEntity<String>("medicament was deleted",HttpStatus.OK);
   }
}
