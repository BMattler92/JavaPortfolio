//Barbara Mattler 2/18/16

import java.text.DecimalFormat;
public class ProductionWorker extends Employee
{
	public static int DAY_SHIFT = 1;
	public static int NIGHT_SHIFT = 2;
	
	private int shift;
	private double payRate;
	
	public ProductionWorker(String n, String num, String date,
			int sh, double rate)
	{
		super(n, num, date);
		shift = sh;
		payRate = rate;
	}
	public ProductionWorker(int shift,double payRate)
	{
		shift = DAY_SHIFT;
		payRate = 0.0;
	}
	public ProductionWorker()
	{
		
	}
	public void setShift(int s)
	{
		shift = s;
	}
	public void setPayRate(double p)
	{
		payRate = p;
	}
	public int getShift()
	{
		return shift;
	}
	public double getPayRate()
	{
		return payRate;
	}
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		String str = super.toString();
		str += "\nShift: ";
		if (shift == DAY_SHIFT)
			str += "Day";
		else if (shift == NIGHT_SHIFT)
			str += "Night";
		else
			str += "INVALID SHIFT NUMBERS";
		return
				str += ("\nHourly Pay Rate: $" +
						dollar.format(payRate));
	}
}