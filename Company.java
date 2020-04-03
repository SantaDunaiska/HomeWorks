import java.util.Random;
public class Company {

	public static void main(String[] args) {
		
		
		        //declare and create 3 objects(as a employee1,2,3) and set params
Employee e1 = new Employee("Michael" , "Security" , "AS Citadele", 1500);
Employee e2 = new Employee("Joahim" , "CEO Assistant" , "SIA Services", 900);
Employee e3 = new Employee("Alabama" , "Translator" , "Tilde", 1000);


System.out.println("............");
System.out.println(e1);
System.out.println("............");
System.out.println(e2);
System.out.println("............");
System.out.println(e3);

System.out.println();
	
//set department for your employes
e1.setDepartment("Main building");		      
e2.setDepartment("Centrs");
e3.setDepartment("Translaltion department");

//System.out.println("After 1 year inside the company:");

System.out.println("After 1 year inside the company: ");
System.out.println("............");
System.out.println("");

//set to change your employee promotion from position to salary

e1.setPosition("head of security");
e1.setSalary(2000);
//////////////////
e2.setPosition("Manager");
e2.setSalary(1700);
/////////////////
e3.setPosition("Project manager");
e3.setSalary(1200);


double salary1 = e1.getSalary();
double salary2 = e2.getSalary();
double salary3 = e3.getSalary();
//calculate employees salary difference after 1 year
double newSalary1 = e1.getSalary();
double difference1 = newSalary1 - salary1;

double newSalary2 = e2.getSalary();
double difference2 = newSalary2 - salary2;

double newSalary3 = e3.getSalary();
double difference3 = newSalary3 - salary3;
		        //out print your employees

System.out.println(e1);
System.out.println("............");
System.out.println(e2);
System.out.println("............");
System.out.println(e3);
System.out.println("............");
System.out.println();


		    }
		
	}


