package com.mindgate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

//		Employee employee = new Employee(4, "updated value", 9000);

		boolean result = employeeService.daleteEmployee(3);
		if (result) {
			System.out.println("delete successfully");
		} else
			System.out.println("delete failed...");
		
		System.out.println();
		
		List<Employee> allEmployees = employeeService.getAllEmployees();
		for (Employee e : allEmployees) {
			System.out.println(e);
		}
		
		

//		Employee employee = employeeService.getEmployeeByEmployeeId(3);
//		
//		System.out.println(employee);
		

//		Employee employee = new Employee(4, "updated value", 9000);
//
//		boolean result = employeeService.addNewEmployee(employee);
//		if (result) {
//			System.out.println("added successfully");
//		} else
//			System.out.println("insert failed...");

	}

}
