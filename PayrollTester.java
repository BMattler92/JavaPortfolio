//Barbara Mattler 2/16/16
import java.util.Scanner; // Need for Scanner class.
import java.text.DecimalFormat;
public class PayrollTester
{
	public static void main(String[] args) 
	{

		double payRate; 
		int hours; 
		double wages;
		int employeeID; 

		// Create the Payroll class.
		Payroll employee = new Payroll();
		Scanner keyboard = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("$#,##0.00")

		//Get Employee ID and hours worked
		for (int index = 0; index < employee.getEmployeeID().length ; index++ )
		{
			System.out.println("EmployeeID:" + employee.getEmployeeID(index));
			System.out.println("Enter the hours worked:");
			hours = keyboard.nextInt();

			employee.setHours(index, hours);

			//Input Validation
			while (hours < 0)
			{
				System.out.println("The number is invalid, please enter a" +
						" positive number.");
				System.out.println("Enter the hours worked:");
				hours = keyboard.nextInt();
				employee.setHours(index, hours);
			} 

			System.out.println("Enter the hourly rate:");
			payRate = keyboard.nextDouble();
			employee.setpayRate(index, payRate);

			//Input Validation
			while (payRate < 6.00)
			{
				System.out.println("The number is invalid, please enter a" +
						" number that is not less then 6.00 for pay rate.");
				System.out.println("Enter the hourly rate");
				payRate = keyboard.nextDouble();
				employee.setpayRate(index, payRate);
			} 
			System.out.println();
		} 
		employee.calcWages();
		for (int index = 0; index < employee.getEmployeeID().length ; index++ )
		{
			System.out.println("EmployeeID: " + employee.getEmployeeID(index) + "\n" +"Gross Pay:"
					+ employee.getGrossPay((employee.getEmployeeID(index))));
		}

		System.out.print("Enter an employee ID number to look up gross pay: ");
		int number;
		number=keyboard.nextInt();
		System.out.print("Gross Pay:" + df.format(employee.getGrossPay(number)));


		keyboard.close();
	}
}