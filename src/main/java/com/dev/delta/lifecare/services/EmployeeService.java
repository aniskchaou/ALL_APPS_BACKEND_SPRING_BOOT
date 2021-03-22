package com.dev.delta.lifecare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.dao.EmployeeRepository;
import com.dev.delta.lifecare.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository  employeeRepository;
	
	public Employee saveOrUpdate(Employee employee)
	{
		
		return employeeRepository.save(employee);
	}
	
	public Iterable<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
	
	public Employee findById(Long id)
	{
		return employeeRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Employee employee=findById(id);
		employeeRepository.delete(employee);
	}
}
