//Barbara Mattler 2/16/16
public class Payroll 
{
	private int[] employeeID = 
				{5658845/*, 4520124, 7895122,
				8777541, 8451277, 1302850,
				7580489*/};
	private int[] hours = new int[7];
	private double[] payRate = new double[7]; 
	private double[] wages = new double[7]; 

	//Setters
	public void setEmployeeID(int index, int employeeID  )
	{
		this.employeeID[index] = employeeID;
	}
	public void setHours(int index, int hours)
	{
		this.hours[index] = hours;
	}
	public void setpayRate(int index, double payRate)
	{
		this.payRate[index] = payRate;
	}


	//Getters
	public int getEmployeeID(int index)
	{
		return employeeID[index];
	}
	public int[] getEmployeeID()
	{
		return employeeID;
	}
	public double getHours(int index)
	{
		return hours[index];
	}
	public double getpayRate(int index)
	{
		return payRate[index];
	}


	public void calcWages()
	{
		for (int i=0;i<employeeID.length;i++)
		{
			wages[i]=payRate[i]*hours[i];
		}
	}


	public double getGrossPay (int employeeNumber)
	{

		for (int i = 0; i < employeeID.length; i++ )
		{
			if(employeeID[i]== employeeNumber)
			{
				return wages[i];
			}
		}
		return 0;

	} 
}