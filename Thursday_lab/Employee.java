package Thursday_lab;

public class Employee extends Person{

		
		double annual_salary;
		int started_year;
		String insurance_number;
		
		  Employee(int age, String name, int year, double salary,String number) {
			  
			    super(age, name);
			    
			    this.started_year = year;
			    this.annual_salary = salary;
			    this.insurance_number=number;
			  }
		
		void printEmployeeDetails() {
			
		    System.out.println("Employee IN     :  " + insurance_number);
		    System.out.println("Employee Name   :  " + name);
		    System.out.println("Employee Age    :  " + age);
		    System.out.println("Employee Salary :  " + annual_salary);
		  }
		
	}

