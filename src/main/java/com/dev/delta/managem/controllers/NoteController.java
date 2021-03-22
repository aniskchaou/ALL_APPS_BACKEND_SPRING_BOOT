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

import com.dev.delta.managem.entities.Note;
import com.dev.delta.managem.services.NoteService;

@RestController
@RequestMapping("/managem/note")
@CrossOrigin
public class NoteController {
	@Autowired
	NoteService noteService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Note projectNote, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Note newPT = noteService.saveOrUpdate(projectNote);

	        return new ResponseEntity<Note>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Note> getAllNotes()
   {
	   return noteService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Note> getNoteById(@PathVariable Long id)
   {
	   Note note=noteService.findById(id);
	   return new ResponseEntity<Note>(note,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteNote(@PathVariable Long id)
   {
	   noteService.delete(id);
	   return new ResponseEntity<String>("note was deleted",HttpStatus.OK);
   }
}
