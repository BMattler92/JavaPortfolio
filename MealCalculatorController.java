//Barbara Mattler 3/2/16
package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class MealCalculatorController {
	@FXML 
	private Label mealLabel;
	@FXML 
	private TextField mealTextfield;
	@FXML 
	private Button calcButton;
	@FXML 
	private Label tipLabel;
	@FXML 
	private Label ftipLabel;
	@FXML 
	private Label taxLabel;
	@FXML 
	private Label ftaxLabel;
	@FXML 
	private Label totalLabel;
	@FXML 
	private Label finalLabel;

	public void initialize() 
	{
		// Perform any necessary initialization here.
	}
	public void calcButtonListener() 
	{ 
		DecimalFormat df= new DecimalFormat("$#,##0.00");

		// Get the amount from mealTextfield
		String str = mealTextfield.getText();
		
		//Calculate Tip, Tax and Total
		double tip= Double.parseDouble(str)*.18;
		double tax=(Double.parseDouble(str)) *.07;
		double total=Double.parseDouble(str) + tip + tax;
		
//		Display the Tip,Tax,and Total
		ftipLabel.setText("The tip will be " + df.format(tip) + ".");
		ftaxLabel.setText("The tax total cost will be " + df.format(tax) + ".");
		finalLabel.setText("The total cost will be " + df.format(total) + "."); 
	}
}
