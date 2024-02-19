package org.inheritance;

public class HirearchialInheritanceEmployer {
	
	String employerName;
	String location;
	int noOfEmp;

	void display(String employerName, String location, int noOfEmp) {

		this.employerName = employerName;
		this.location = location;
		this.noOfEmp = noOfEmp;

		System.out.println("name of the employer: " + employerName);
		System.out.println("location : " + location);
		System.out.println("number of empoyees working : " + noOfEmp);

	}

}

class HieManager extends HirearchialInheritanceEmployer {
	String name;
	int empId;
	int salary;

	void manager(String managerName, int managerId, int managersalary) {
		name = managerName;
		empId = managerId;
		salary = managersalary;

		System.out.println("manager name: " + name);
		System.out.println("manager ID: " + empId);
		System.out.println("managersalary: " + salary);
	}
}

class HieEngineer extends HirearchialInheritanceEmployer  {
	String name;
	int empId;
	int salary;
	
	void engineer(String engineerName, int engineerid, int engineersalary) {

		name = engineerName;
		empId = engineerid;
		salary = engineersalary;

		System.out.println("engineername: " + name);
		System.out.println("manager id: " + empId);
		System.out.println("engineer salary: " + salary);

	}
} 

class HieSalesPerson extends HirearchialInheritanceEmployer{
	String name;
	int empId;
	int salary;
	
	void salesPerson(String spName, int spId, int spsalary) {

		name = spName;
		empId = spId;
		salary = spsalary;

		System.out.println("sales person name: " + name);
		System.out.println("sales peson id: " + empId);
		System.out.println("sales person salary: " + salary);

	}

}
