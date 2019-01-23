package controller;


import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

	
	@FXML private DatePicker datePicker;
	@FXML private TextField txtField;
	@FXML private Label consoleLogs;
	
	
	public void setDatePicker() {
		datePicker.setValue(LocalDate.now());
		datePicker.setOnAction(event->{
			LocalDate date=datePicker.getValue();
			System.out.println(date+"hi2");
		txtField.setText("Date selected is: "+date.toString());
			
		});
	}
	
}
