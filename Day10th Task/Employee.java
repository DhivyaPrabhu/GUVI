//Question Number:2
package Day10Task;

public class Employee {

	int employee_id;
	String Firstname ;
	 String Lastname;
	  String employee_name;
	   int employee_salary;
	  int employee_anualsalary;

	  public int getEmployeeId() {
	    return employee_id;
	  }

	  public void setEmployeeId(int employeeId) {
	    this.employee_id = employeeId;
	  }

	  public String getFirstName() {
	    return Firstname;
	  }

	  public void setFirstName(String FirstName) 
	  {
	    this.Firstname = FirstName;
	  }
	  public String getLastName() {
		    return Lastname;
		  }

		  public void setLastName(String LastName) 
		  {
		    this.Lastname = LastName;
		  }
		  public String getemployee_name()
		  {
			  return employee_name;
		  }
		  
		 public void setemployee_name()
		  {
			  this.employee_name=Firstname+" "+Lastname;
		  }
		  
		  public String toString(){//overriding the toString() method  
			  return "Employee ID:"+employee_id+" Employeee Name:" +employee_name+" Employee Salary: "+employee_salary+" Employee Annual Salary: "+employee_anualsalary;  
			 }  
	  
	  public int getEmployeeSalary() {
	    return employee_salary;
	  }

	  public void setEmployeeSalary(int employeesalary) 
	  {
	    this.employee_salary = employeesalary;
	  }
	  public int getEmployeeanualSalary() {
		    return employee_anualsalary;
		  }
	  public void setEmployeeanualSalary(int employeeanualsalary) 
	  {
	    this.employee_anualsalary = employeeanualsalary;
	  }
	//methods for calculating Raised Salary

	  void RaisedSalary() 
	  {
	    
		  double RaisedSalary=employee_salary+(employee_salary*30/100);
		System.out.println("The Raised Salary is: "+ RaisedSalary +"(30% of Salary has been raised)");
	  }
	  public static void main(String[] args) 
		{
		// Create an instance of Employee
		    Employee employee = new Employee();

		    // Set values using setter methods
		    employee.setEmployeeId(1001);
		    employee.setFirstName("Raja");
		    employee.setLastName("Prabhu");
	        employee.setemployee_name();
		    employee.setEmployeeSalary(5000);
		    employee.setEmployeeanualSalary(12*5000);
		    System.out.println(employee);
		 employee.RaisedSalary();
		}}
