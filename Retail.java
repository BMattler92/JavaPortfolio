//Barbara Mattler 2/25/16
public class Retail {
	private String description;
	 private int units;
	 private double price;
	 
	 public void setDescription(String d)
		{
		description = d;
		}
	public void setUnits(int u) 
		{
		units = u;
		}
	public void setPrice(double p)
		{
		price = p;
		}
	public String getDescription()
		{
		return description;
		}
	public int getUnits() throws NegativeUnits
		{
		if (units<0)
		{
			throw new NegativeUnits();
		}
		return units;
		}
	public double getPrice() throws NegativePrice 
		{
		if (price<0)
		{
			throw new NegativePrice();
		}
		return price;
		}
}


