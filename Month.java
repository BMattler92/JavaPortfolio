//Barbara Mattler 2/9/16
public class Month {
	private int monthNumber;

	//Constructors
	public Month()
	{
		monthNumber=1;
	}
	public Month( int monthNumber)
	{
		if(monthNumber>=1 && monthNumber<=12){
			this.monthNumber=monthNumber;
		}
		else 
			monthNumber=1;
	}
	//enum Months {JANUARY, FEBRUARY,MARCH, APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}

	public Month(String monthName)
	{
		monthName = monthName.toUpperCase();

		if(monthNumber>=1 && monthNumber<=12){
			switch (monthName)
			{
			case "JANUARY":
				monthNumber =1;
				break;
			case "FEBRUARY":
				monthNumber=2;
				break;
			case "MARCH":
				monthNumber=3;
				break;
			case "APRIL":
				monthNumber=4;
				break;
			case "MAY":
				monthNumber=5;
				break;
			case "JUNE":
				monthNumber=6;
				break;
			case "JULY":
				monthNumber=7;
				break;
			case "AUGUST":
				monthNumber=8;
				break;
			case "SEPTEMBER":
				monthNumber=9;
				break;
			case "OCTOBER":
				monthNumber=10;
				break;
			case "NOVEMBER":
				monthNumber=11;
				break;
			case "DECMBER":
				monthNumber=12;
				break;
			}
		}
		else 
		{
			monthNumber=0;
		}
	}
	//Accessor
	public int getMonthNumber() 
	{
		return monthNumber;
	}

	public String getMonthName()
	{
		if(monthNumber ==1)
		{
			return "January";
		}
		else if (monthNumber==2)
		{
			return "February";
		}
		else if (monthNumber==3)
		{
			return "March";
		}else if (monthNumber==4)
		{
			return "April";
		}else if (monthNumber==5)
		{
			return "May";
		}else if (monthNumber==6)
		{
			return "June";
		}
		else if (monthNumber==7)
		{
			return "July";
		}
		else if (monthNumber==8)
		{
			return "August";
		}
		else if (monthNumber==9)
		{
			return "September";
		}
		else if (monthNumber==10)
		{
			return "October";
		}
		else if (monthNumber==11)
		{
			return "November";
		}
		else if (monthNumber==12) 
		{
			return "December";
		}
		else
		{ 
			return "Invalid Choice";
		}
	}
	//Mutator
	public void setMonthNumber(int monthNumber) {
		if(monthNumber>=1 && monthNumber<=12){
			this.monthNumber=monthNumber;
		}
		else 
			monthNumber=1;
	}
	// Method to set monthNumber
	public int setMonthNumber()
	{
		return monthNumber;
	}
	//Equals Method
	public boolean equals(Month m)
	{	
		boolean status; 

		if(this.getMonthNumber() == m.getMonthNumber())
		{status=true;}
		else
		{status= false;}	

		return status;
	}
	//toString Method
	public String toString()
	{
		return getMonthName();
	}
	//greaterThan Method
	public boolean greaterThan(Month m)
	{
		boolean status; 

		if(this.getMonthNumber() > m.getMonthNumber())
		{status=true;}
		else
		{status= false;}	

		return status;	
	}
	//lessThan Method
	public boolean lessThan(Month m)
	{
		boolean status; 

		if(this.getMonthNumber() < m.getMonthNumber())
		{status=true;}
		else
		{status= false;}	

		return status;	
	}
}
