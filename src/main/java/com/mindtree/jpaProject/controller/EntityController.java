package com.mindtree.jpaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.jpaProject.entity.Employee;
import com.mindtree.jpaProject.service.EmployeeDaoService;

@RestController
public class EntityController {
	
	@Autowired
	private EmployeeDaoService service;
	
	//retrieveAll
	@GetMapping("/employees")
	public List<Employee> retrieveAll(){
		return service.retrieveAll();
	}
	
	
	//retrieveEmployee
	@GetMapping("/employees/{id}")
	public Employee retrieveEmployee(@PathVariable int id) {
		return service.retrieveEmployee(id);
	}
	
	
	//deleteEmployee
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id) {
		try {
			service.deleteEmployee(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//addEmployee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	
	//updateEmployee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
}
