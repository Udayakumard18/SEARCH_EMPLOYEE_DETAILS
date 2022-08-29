package com.example.SearchEngine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SearchEngine.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	// @Query("SELECT * FROM  employee WHERE (ename  LIKE '%?1%')");
	 // @Query("FROM employee WHERE firstName = ?1")
	
	

//	    
	    
	// @Query("SELECT id,ename,salary,mobile FROM Employee ")
	
	//@Query("SELECT employee FROM Employee employee WHERE CONCAT(employee.id,'',employee.ename,'',employee.mobile,'',employee.salary)LIKE%?1%")
	
	
	// public List<Employee>search(String keyword);
// public List<Employee> StudentfindByEname(String ename);
	
	public List<Employee>	findByEnameContains(String name);
}
