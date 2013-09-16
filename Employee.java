public class Employee
{
	private String lastName;
	private String firstName;
	private double salary;
	
	public void setLastname(String lName)
	{
		lastName=lName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setFirstname(String fName)
	{
		firstName=fName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setSalary( double sal)
	{
		if (sal<=0)
			System.out.println ("You entered negative number for salary. Please enter a positive number!");
		else
			salary=sal;
	}
	public double getSalary()
	{
		return salary;
	}	
}

