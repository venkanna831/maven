package com.mindtree.jpaProject.service;

import java.util.List;

import com.mindtree.jpaProject.entity.Employee;

public interface EmployeeDaoService {
	public List<Employee> retrieveAll();
	
	public Employee retrieveEmployee(int id);
	
	public void deleteEmployee(int id);
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
}
