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

import com.dev.delta.managem.entities.Message;
import com.dev.delta.managem.services.MessageService;

@RestController
@RequestMapping("/managem/massage")
@CrossOrigin
public class MessageController {
	@Autowired
	MessageService messageService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Message projectMessage, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Message newPT = messageService.saveOrUpdate(projectMessage);

	        return new ResponseEntity<Message>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Message> getAllMessages()
   {
	   return messageService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Message> getMessageById(@PathVariable Long id)
   {
	   Message message=messageService.findById(id);
	   return new ResponseEntity<Message>(message,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteMessage(@PathVariable Long id)
   {
	   messageService.delete(id);
	   return new ResponseEntity<String>("message was deleted",HttpStatus.OK);
   }
}
