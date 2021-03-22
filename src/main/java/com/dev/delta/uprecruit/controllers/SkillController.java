package com.dev.delta.uprecruit.controllers;

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

import com.dev.delta.uprecruit.entities.Skill;
import com.dev.delta.uprecruit.services.SkillService;

@RestController
@RequestMapping("/uprecruit/skill")
@CrossOrigin
public class SkillController {
	@Autowired
	SkillService skillService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Skill projectSkill, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Skill newPT = skillService.saveOrUpdate(projectSkill);

	        return new ResponseEntity<Skill>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Skill> getAllSkills()
   {
	   return skillService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Skill> getSkillById(@PathVariable Long id)
   {
	   Skill skill=skillService.findById(id);
	   return new ResponseEntity<Skill>(skill,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteSkill(@PathVariable Long id)
   {
	   skillService.delete(id);
	   return new ResponseEntity<String>("skill was deleted",HttpStatus.OK);
   }
}
