//Barbara Mattler 2/4/16
import java.text.DecimalFormat;
public class Pennies 
{
	public static void main(String[] args)
	{

		double money;
		double totalEarned;

		DecimalFormat df = new DecimalFormat("$#,##0.00");

		System.out.println("Days \t Salary Earned");
		money =.01;
		totalEarned=0;
		for (int days=1; days<=20; days++)
		{
			System.out.println(days+"\t"+ df.format(money));	
			totalEarned+= money;
			money*=2;
		}

		System.out.println("Your salary so far is " + df.format(totalEarned));
	}
}
