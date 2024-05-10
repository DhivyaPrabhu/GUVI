//Q.No:1
package com.example.hrtest;
import com.example.hr.Employee;
public class Employeetest 
{
	public static void main(String[] args) 
	{
	    // Creating an instance of the Employee class
	    Employee emp = new Employee("Ramu", 101, 50000.0);

	    // Calling methods to print employee name and salary
	    emp.printName();
	    emp.printSalary();
	}
	}
