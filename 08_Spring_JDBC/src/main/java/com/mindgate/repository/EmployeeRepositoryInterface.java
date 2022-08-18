package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean daleteEmployee( int employyeeId);
	Employee getEmployeeByEmployeeId(int employeeId);
	List<Employee> getAllEmployees();
}
