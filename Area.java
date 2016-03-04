//Barbara Mattler 2/4/16
public class Area {
 
	//area of a circle
	public static double calcArea(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}
	//area of a rectangle
	public static double calcArea(int width,int length)
	{
		return width * length;
	}
	//area of a cylinder
	public static double calcArea(double radius, double height)
	{
		return Math.PI * Math.pow(radius,2)*height;
	}
}
