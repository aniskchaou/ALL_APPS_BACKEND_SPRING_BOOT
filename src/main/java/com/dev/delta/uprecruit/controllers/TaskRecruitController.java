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

import com.dev.delta.uprecruit.entities.CategoryRecruit;
import com.dev.delta.uprecruit.services.CategoryRecruitService;

@RestController
@RequestMapping("/uprecruit/task")
@CrossOrigin
public class TaskRecruitController {
	@Autowired
	CategoryRecruitService categoryService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody CategoryRecruit projectCategory, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        CategoryRecruit newPT = categoryService.saveOrUpdate(projectCategory);

	        return new ResponseEntity<CategoryRecruit>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<CategoryRecruit> getAllCategorys()
   {
	   return categoryService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<CategoryRecruit> getCategoryById(@PathVariable Long id)
   {
	   CategoryRecruit category=categoryService.findById(id);
	   return new ResponseEntity<CategoryRecruit>(category,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteCategory(@PathVariable Long id)
   {
	   categoryService.delete(id);
	   return new ResponseEntity<String>("category was deleted",HttpStatus.OK);
   }
}
