// Java Program to Demonstrate DepartmentService File

// Importing required package modules
package com.h2.db.service;
// Importing required classes
import java.util.List;

import com.h2.db.entity.*;

// Interface
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department,
								Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);

}
