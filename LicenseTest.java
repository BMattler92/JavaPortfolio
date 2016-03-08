//BarbaraMattler 2/16/16
import java.util.Scanner;
public class LicenseTest 
{
	public static void main(String[] args){


		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your answers below:");

		char[] studentAnswers=new char[20];

		for(int i = 0; i < studentAnswers.length; i++)
		{
			char input;
			do
			{
				System.out.print(i + 1 + ". ");

				input = Character.toUpperCase(keyboard.next().charAt(0));
			}
			while(input < 'A' || input >'D');
		studentAnswers[i] = input;
		}	
		      License driver = new License(studentAnswers){};
		      System.out.println();
		      System.out.println("You "+(driver.passed()?"passed" : "did not pass") + ".\n");
		      System.out.println("Correct: " + driver.totalCorrect() + "\n");
		      System.out.println("Incorrect: " + driver.totalIncorrect() + "\n");
		      System.out.println("Questions missed: ");
		    		  for(int x: driver.questionsMissed())
		    		  {
		    			System.out.println(x);  
		    		  }
		    		  ;

	keyboard.close();
	}	
}

