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

import com.dev.delta.managem.entities.Task;
import com.dev.delta.managem.services.TaskService;

@RestController
@RequestMapping("/managem/task")
@CrossOrigin
public class TaskController {
	@Autowired
	TaskService taskService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Task projectTask, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Task newPT = taskService.saveOrUpdate(projectTask);

	        return new ResponseEntity<Task>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Task> getAllTasks()
   {
	   return taskService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Task> getTaskById(@PathVariable Long id)
   {
	   Task task=taskService.findById(id);
	   return new ResponseEntity<Task>(task,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteTask(@PathVariable Long id)
   {
	   taskService.delete(id);
	   return new ResponseEntity<String>("task was deleted",HttpStatus.OK);
   }
}
