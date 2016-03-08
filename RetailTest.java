//Barbara Mattler 2/25/16
public class RetailTest {
	public static void main(String[] args) {
		Retail item1=new Retail();
		Retail item2=new Retail();
		Retail item3=new Retail();

		//setting the info for item1
		item1.setDescription("Jacket");
		item1.setUnits(12);
		item1.setPrice(59.95);

		//setting the info for item2
		item2.setDescription("Designer Jeans");
		item2.setUnits(-40);
		item2.setPrice(34.95);

		//setting the info for item3
		item3.setDescription("Shirt");
		item3.setUnits(20);
		item3.setPrice(24.95);

		try 
		{
			System.out.println(item1.getDescription()+ "     " + item1.getUnits() + "     " + item1.getPrice());
		} 
		catch (NegativeUnits e) 
		{
			e.printStackTrace();
		}

		catch (NegativePrice e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try 
		{
			System.out.println(item2.getDescription()+ "     " + item2.getUnits() + "     " + item2.getPrice());
		} 
		catch (NegativeUnits e) 
		{
			e.printStackTrace();
		}
		catch (NegativePrice e) 
		{
			e.printStackTrace();
		}

		try 
		{
			System.out.println(item3.getDescription()+ "     " + item3.getUnits() + "     " + item3.getPrice());
		} 
		catch (NegativeUnits e) 
		{
			e.printStackTrace();
		} 
		catch (NegativePrice e) 
		{
			e.printStackTrace();
		}
	}
}
