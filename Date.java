
public class Date 
{
private int Day;
private int Month;
private int Year;

public void setDay(int day)
{
	Day=day;
}
public int getDay()
{
	return Day;
}

public void setMonth(int month)
{
	Month=month;
}
public int getMonth()
{
	return Month;
}

public void setYear(int year)
{
	Year=year;
}
public int getYear()
{
	return Year;
}

public void displayDate()
{
	System.out.printf("The date you entered is %s/%s/%s",Month,Day,Year);
}
}
