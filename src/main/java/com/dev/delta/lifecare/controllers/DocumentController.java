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

import com.dev.delta.lifecare.entities.Document;
import com.dev.delta.lifecare.services.DocumentService;

@RestController
@RequestMapping("/lifecare/document")
@CrossOrigin
public class DocumentController {
	@Autowired
	DocumentService documentService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Document projectDocument, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Document newPT = documentService.saveOrUpdate(projectDocument);

	        return new ResponseEntity<Document>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Document> getAllDocuments()
   {
	   return documentService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Document> getDocumentById(@PathVariable Long id)
   {
	   Document document=documentService.findById(id);
	   return new ResponseEntity<Document>(document,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteDocument(@PathVariable Long id)
   {
	   documentService.delete(id);
	   return new ResponseEntity<String>("document was deleted",HttpStatus.OK);
   }
}
