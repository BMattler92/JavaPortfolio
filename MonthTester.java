import java.util.Scanner;

//Barbara Mattler 2/9/16

public class MonthTester 
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter a number 1 - 12 to get the name of the month:");
		Month month=new Month();
		month.setMonthNumber(keyboard.nextInt());
		
		System.out.print(month.getMonthName());
		
		keyboard.close();
	}
}
