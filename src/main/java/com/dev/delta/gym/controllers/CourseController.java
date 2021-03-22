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

import com.dev.delta.gym.entities.Course;
import com.dev.delta.gym.service.CourseService;

@RestController
@RequestMapping("/fastbus/course")
@CrossOrigin
public class CourseController {
	@Autowired
	CourseService courseService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Course projectCourse, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Course newPT = courseService.saveOrUpdate(projectCourse);

	        return new ResponseEntity<Course>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Course> getAllCourses()
   {
	   return courseService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Course> getCourseById(@PathVariable Long id)
   {
	   Course course=courseService.findById(id);
	   return new ResponseEntity<Course>(course,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteCourse(@PathVariable Long id)
   {
	   courseService.delete(id);
	   return new ResponseEntity<String>("course was deleted",HttpStatus.OK);
   }
}
