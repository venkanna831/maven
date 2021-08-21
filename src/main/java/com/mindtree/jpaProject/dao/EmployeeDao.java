package com.mindtree.jpaProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.jpaProject.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
