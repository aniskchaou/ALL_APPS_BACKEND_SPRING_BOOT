package com.dev.delta.managem.controllers;

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

import com.dev.delta.managem.entities.MyTask;
import com.dev.delta.managem.services.MyTaskService;

@RestController
@RequestMapping("/managem/mytask")
@CrossOrigin
public class MyTaskController {
	@Autowired
	MyTaskService myTaskService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody MyTask projectMyTask, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        MyTask newPT = myTaskService.saveOrUpdate(projectMyTask);

	        return new ResponseEntity<MyTask>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<MyTask> getAllMyTasks()
   {
	   return myTaskService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<MyTask> getMyTaskById(@PathVariable Long id)
   {
	   MyTask myTask=myTaskService.findById(id);
	   return new ResponseEntity<MyTask>(myTask,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteMyTask(@PathVariable Long id)
   {
	   myTaskService.delete(id);
	   return new ResponseEntity<String>("myTask was deleted",HttpStatus.OK);
   }
}
