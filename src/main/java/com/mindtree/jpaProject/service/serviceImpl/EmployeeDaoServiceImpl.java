package com.mindtree.jpaProject.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.jpaProject.dao.EmployeeDao;
import com.mindtree.jpaProject.entity.Employee;
import com.mindtree.jpaProject.service.EmployeeDaoService;

@Service
public class EmployeeDaoServiceImpl implements EmployeeDaoService{
	
	@Autowired
	private EmployeeDao employeeDao;
//	private static List<Employee> employees = new ArrayList<>();
//	
//	static {
//		employees.add(new Employee(1,"Venu","Bhilai Chhattisgarh"));
//		employees.add(new Employee(2,"Mayuri","Raipur Chhattisgarh"));
//		employees.add(new Employee(3,"Krishna","Bhubaneswar Odisha"));
//	}
	
	@Override
	public List<Employee> retrieveAll(){
		
		return employeeDao.findAll();
	}
	
	@Override
	public Employee retrieveEmployee(int id) {
//		for(Employee employee:employees) {
//			if(employee.getId()==id) {
//				return employee;
//			}
//		}
//		return null;
		return employeeDao.getById(id);
	}
	
	@Override
	public void deleteEmployee(int id) {
//		Iterator<Employee> i= employees.iterator();
//		while(i.hasNext()) {
//			Employee employee=i.next();
//			if(employee.getId()==id) {
//				i.remove();
//				return employee;
//			}
//		}
//		return null;
		Employee employee = employeeDao.getById(id);
		employeeDao.delete(employee);
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
//		employees.add(employee);
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
//		Iterator<Employee> i= employees.iterator();
//		while(i.hasNext()) {
//			Employee emp = i.next();
//			if(emp.getId()==employee.getId()) {
//				emp.setName(employee.getName());
//				emp.setAddress(employee.getAddress());
//				return employee;
//			}
//		}
//		return null;
		employeeDao.save(employee);
		return employee;
	}
}
