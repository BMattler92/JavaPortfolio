//Barbara Mattler 3/2/16
package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameFormatterController {
	//Textfields
	@FXML 
	private TextField firstTextfield;
	@FXML 
	private TextField middleTextfield;
	@FXML 
	private TextField lastTextfield;
	@FXML 
	private TextField titleTextfield;

	//Labels
	@FXML 
	private Label fistLabel;
	@FXML 
	private Label middleLabel
	;@FXML 
	private Label lastLabel;
	@FXML 
	private Label titleLabel;
	@FXML 
	private Label outputLabel;

	//Buttons	
	@FXML 
	private Button tfmlButton;
	@FXML 
	private Button fmlButton;
	@FXML 
	private Button flButton;
	@FXML 
	private Button lfmtButton;
	@FXML 
	private Button lfmButton;
	@FXML 
	private Button lfButton;

	public void initialize() 
	{
		// Perform any necessary initialization here.
	}
	public void tfmlButtonListener() 
	{ 
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str2 = middleTextfield.getText();
		String str3 = lastTextfield.getText();
		String str4= titleTextfield.getText();

		// Display the converted distance.
		outputLabel.setText(str4+". " +str+" "+str2+" "+str3); 
	}
	public void fmlButtonListener() 
	{ 
		
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str2 = middleTextfield.getText();
		String str3 = lastTextfield.getText();

		// Display the converted distance.
		outputLabel.setText(str+" "+str2+" "+str3); 
	}
	public void flButtonListener() 
	{ 
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str3 = lastTextfield.getText();
	
		// Display the converted distance.
		outputLabel.setText(str+" "+str3); 
	}
	public void lfmtButtonListener() 
	{ 
		
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str2 = middleTextfield.getText();
		String str3 = lastTextfield.getText();
		String str4= titleTextfield.getText();

		// Display the converted distance.
		outputLabel.setText(str3+" " + str+" "+ str2+" " + str4+"." ); 
	}
	public void lfmButtonListener() 
	{ 
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str2 = middleTextfield.getText();
		String str3 = lastTextfield.getText();
		
		// Display the converted distance.
		outputLabel.setText(str3+" "+str+" "+str2); 
	}
	public void lfButtonListener() 
	{
		// Get the kilometers from the TextField.
		String str = firstTextfield.getText();
		String str3 = lastTextfield.getText();
	
		// Display the converted distance.
		outputLabel.setText(str3+" "+str); 
	}
}
