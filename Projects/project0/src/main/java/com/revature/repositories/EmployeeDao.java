package com.revature.repositories;


import java.util.List;
import com.revature.models.Employee;


public interface EmployeeDao extends GenericDao<Employee>{
	Employee[] getAllEmployees();    //returns available employees
	Employee getEmployeeById(int id);
	int addEmployee(Employee e);  // returns employee id
	
	boolean editEmployee(Employee e);  
	boolean deleteEmployee(int id);  //returns the boolean 
}
