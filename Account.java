//BarbaraMattler 2/16/16
public class Account
{
		/*private static int validAccountNumbers[] = 
			{5658845,4520125,7895122,8777541,8451277,1302850,
			8080152,4562555,5552012,5050552,7825877,1250255,
			1005231,6545231,3852085,7576651,7881200,4581002};
		
		// check if an account number is valid by comparing it to valid numbers
		public static boolean valid(int number) 
		{
			for (int i = 0; i < validAccountNumbers.length; i++) 
			{
				if ( validAccountNumbers[i] == number ) 
				{
					return true;
				}
			}
			// returns false if account is not on the list
			return false;
		}*/
		public static boolean valid(int number,int[] account) 
		{
			for (int i = 0; i < account.length; i++) 
			{
				if ( account[i] == number ) 
				{
					return true;
				}
			}
			// returns false if account is not on the list
			return false;
		}
	}


