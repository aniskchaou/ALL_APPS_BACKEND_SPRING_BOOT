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

import com.dev.delta.gym.entities.MemberGYM;
import com.dev.delta.gym.service.MemberGYMService;

@RestController
@RequestMapping("/fastbus/member")
@CrossOrigin
public class MemberGYMController {
	@Autowired
	MemberGYMService memberService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody MemberGYM projectMember, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        MemberGYM newPT = memberService.saveOrUpdate(projectMember);

	        return new ResponseEntity<MemberGYM>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<MemberGYM> getAllMembers()
   {
	   return memberService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<MemberGYM> getMemberById(@PathVariable Long id)
   {
	   MemberGYM member=memberService.findById(id);
	   return new ResponseEntity<MemberGYM>(member,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteMember(@PathVariable Long id)
   {
	   memberService.delete(id);
	   return new ResponseEntity<String>("member was deleted",HttpStatus.OK);
   }
}
