import java.util.Scanner;
public class EmployeeTest
{
	public static void main( String[] args)
	{
		Employee A= new Employee();
		Employee B= new Employee();
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Please enter last name: ");
		A.setLastname(input1.nextLine());
		A.getLastName();			
		System.out.print("Please enter first name: ");
		A.setFirstname(input1.nextLine());
		A.getFirstName();		
		System.out.print("Please enter monthly salary: ");
		A.setSalary(input1.nextDouble());
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Please enter last name: ");
		B.setLastname(input2.nextLine());
		B.getLastName();			
		System.out.print("Please enter first name: ");
		B.setFirstname(input2.nextLine());
		B.getFirstName();		
		System.out.print("Please enter monthly salary: ");
		B.setSalary(input2.nextDouble());
		

		System.out.println ("The first employee: "+A.getLastName()+" "+A.getFirstName());
		System.out.println ("Yearly salary: "+A.getSalary()*12);
		System.out.println ("Yearly salary after rising 10%: "+((A.getSalary()*12)+(A.getSalary()*0.1)*12));
		System.out.println ("The second employee: "+ B.getLastName() +" "+B.getFirstName());
		System.out.println ("Yearly salary: "+B.getSalary()*12);
		System.out.println ("Yearly salary after rising 10%: "+((B.getSalary()*12)+(B.getSalary()*0.1)*12));
		
		
	}
}
