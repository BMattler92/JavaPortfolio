//Barbara Mattler 3/1/16
package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class PriceCalculatorController {
	@FXML 
	private Button priceButton;

	@FXML 
	private TextField wholesaleTextfield;

	@FXML 
	private TextField markupTextfield;

	@FXML 
	private Label wholesaleLabel;

	@FXML 
	private Label markupLabel;

	@FXML 
	private Label retailLabel;

	@FXML 
	private Label costLabel;
	
	public void initialize() 
    {
        // Perform any necessary initialization here.
    }

	public void priceButtonListener() 
	{ 
		DecimalFormat df= new DecimalFormat("$#,##0.00");
		
		// Get the kilometers from the TextField.
		String str = wholesaleTextfield.getText();
		String str2 = markupTextfield.getText();


		// Convert kilometers to miles.
		double cost=Double.parseDouble(str) + (Double.parseDouble(str) * Double.parseDouble(str2));

		// Display the converted distance.
		costLabel.setText("The retail cost will be " + df.format(cost) + "."); 
	}
}
