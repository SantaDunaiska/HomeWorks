import java.util.Random; 

public class Employee {

 //instance variables for id, name, position, department, company, salary
private int ID;
private	String department;
private	String name;
private	String position;
private	String company;
private	double salary;
	
//constructor with 4 params, except id and department
	public Employee(String department, String name, String position, String company, double salary) {
		this.department = department;
		this.name = name;
		this.position = position;
		this.company = company;
		this.salary = salary;
}
	
	public Employee(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}

	//inside the constructor generate a random number between 1 and 100 as ID number
	public static double getRandomNumber(){
	    double id = Math.random();
	    return id;    
}


//declare set get Methods for department, position, salary
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
	
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

 //Override all toString method for better explanation about our object
public String toString() 
{ 
	//private int ID;
	//private	String department;
	//private	String name;
	//private	String position;
	//private	String company;
	//private	double salary;

return "Employee (ID = " + ID + ", department = " + department + ", name = " + name + ", position = " + position + ", company = " + company +", salary = " + salary +")";
}
}