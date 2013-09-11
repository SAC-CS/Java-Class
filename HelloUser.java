import java.util.Scanner;
public class HelloUser
{
    public static void main( String[] args)
    {
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter username:");
	String userName = input.nextLine();
        	System.out.printf ("Hello: " + userName);
    }   
}