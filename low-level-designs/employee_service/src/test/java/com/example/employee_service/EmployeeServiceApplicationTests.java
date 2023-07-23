package com.example.employee_service;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Mock
	private EmployeeManager manager;

	int getNumberOfEmployee(EmployeeManager employeeManager) { 
		return employeeManager.getAllEmployees().getEmployees().size();
	}

	@Test
	void createManager() { 
		EmployeeManager manager = new EmployeeManager();
		
		assert(getNumberOfEmployee(manager) != 0); 

	}


	@ExtendWith(MockitoExtension.class)
	@BeforeEach void setUp() { 
		this.manager = new EmployeeManager();
		Employee newEmployee = new Employee(1, "one", "two", "three", "Product Designer");
		
		manager.addEmployee(newEmployee);
	}


	// Check if employee is in the list 
	@Test
	void checkId() { 

		List<Employee> list =  manager.getAllEmployees().employees;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == 1) { 
				return;
			}
		}
		assert(false);
	}

	// Check whether added employee first name is found in first name field 
	void checkFirstName() { 

		List<Employee> list =  manager.getAllEmployees().employees;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName() == "one") { 
				return;
			}
		}
		assert(false);
	}


	// Check whether added employee last name is found in last name field 
	void checkLastName() { 

		List<Employee> list =  manager.getAllEmployees().employees;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLastName() == "two") { 
				return;
			}
		}
		assert(false);
	}

	// Check whether added employee title is found in the list 
	void checkTitle() { 

		List<Employee> list =  manager.getAllEmployees().employees;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle() == "Product Designer") { 
				return;
			}
		}
		assert(false);
	}

	// Check whether added employee email is found in the list 
	void checkEmail() { 

		List<Employee> list =  manager.getAllEmployees().employees;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle() == "three") { 
				return;
			}
		}
		assert(false);
	}

}
