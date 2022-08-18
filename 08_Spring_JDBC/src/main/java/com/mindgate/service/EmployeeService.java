package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepositoryInterface;
@Service
public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;
	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeRepositoryInterface.addNewEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeRepositoryInterface.updateEmployee(employee);
	}

	@Override
	public boolean daleteEmployee(int employyeeId) {
		return employeeRepositoryInterface.daleteEmployee(employyeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeRepositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepositoryInterface.getAllEmployees();
	}

}
