//Barbara Mattler 2/4/16
import java.util.Scanner;
public class GreatestLeast {
	public static void main(String[] args) {
		 
		int number;

		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter a number:");
		number = keyboard.nextInt();
		
		int high=number;
		int low=number;
		
			while(number!=-99)
			{
				if (number >= high)
				{
					high = number;
				}
				else if(number <= low)
				{
					low = number;
				}	
				
				System.out.print("Enter a number:");
				number = keyboard.nextInt();
			}
			System.out.println("The highest number is: " + high);
			System.out.println("The lowest number is: " + low);

			keyboard.close();
		
	}
}
