package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Generator;

public class MainWindowController {

	private Generator g;
    @FXML
    private AnchorPane pane;

    @FXML
    private TextField txtField;

    @FXML
    private Button button;

    @FXML
    void generate(ActionEvent event) {
    	try {
    		txtField.clear();
        	int n = Integer.parseInt(txtField.getText());
        	//here we get the size of the rows and columns
        	//of the matrix we wnt to display
        	g = new Generator(n);
        	int matrixDimenssion [] = g.matrixDistribution();
        	int r = matrixDimenssion[0];
        	int c = matrixDimenssion[1];
        	load(event,r,c );
    	}catch(NumberFormatException e) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning ");
    		alert.setHeaderText("You must give an integer as  input");
    		alert.setContentText("Please type an integer and try again!");

    		alert.showAndWait();
    	}
    }
    
    private void load(ActionEvent event, int r, int c) {
		
		
	}

	@FXML
    void initialize() {
    	
    }

}
