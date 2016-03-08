//BarbaraMattler 2/16/16
import java.util.Scanner;
import java.io.*;
public class AccountTester {

	public static void main(String[] args)throws IOException  
	{
		Scanner keyboard = new Scanner(System.in);
		File fw= new File("validNumbers.txt");
		Scanner input=new Scanner(fw);

		int[] accounts= new int [18];

		for (int x=0;input.hasNext()&& x< accounts.length; x++)
		{accounts[x]=input.nextInt();}

		// ask the user for an account number
		System.out.print("Please enter your seven digit account number: ");
		int number = keyboard.nextInt();
		// check to see if the number is valid
		if ( Account.valid(number,accounts)) {
			System.out.println("That number is valid.");
		} else {
			System.out.println("That number is invalid.");

		/*
		// check to see if the number is valid
		if ( Account.valid(number) == true ) {
			System.out.println("That number is valid.");
		} else {
			System.out.println("That number is invalid.");
		}*/

		input.close();
		keyboard.close();
	}
}
}
