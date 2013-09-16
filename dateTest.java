import java.util.Scanner;;
public class dateTest 
{
	public static void main(String[] args)
	{
		Date dat=new Date();
		Scanner input=new Scanner(System.in);
		
	    System.out.print("Enter date: ");
	    dat.setMonth(input.nextInt());
	    dat.getMonth();
	    
	
	    System.out.print("Enter day: ");
	    dat.setDay(input.nextInt());
	    dat.getDay();
	    
	
	    System.out.print("Enter year: ");
	    dat.setYear(input.nextInt());
	    dat.getYear();
	    
	    dat.displayDate();
	}	
}
