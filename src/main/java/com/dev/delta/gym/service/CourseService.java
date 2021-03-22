package com.dev.delta.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.dao.CourseRepository;
import com.dev.delta.gym.entities.Course;
@Service
public class CourseService {
	@Autowired
	CourseRepository  courseRepository;
	
	public Course saveOrUpdate(Course course)
	{
		
		return courseRepository.save(course);
	}
	
	public Iterable<Course> findAll()
	{
		return courseRepository.findAll();
	}
	
	public Course findById(Long id)
	{
		return courseRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Course course=findById(id);
		courseRepository.delete(course);
	}
}
