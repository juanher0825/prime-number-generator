package ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
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
    		
        	int n = Integer.parseInt(txtField.getText());
        	//here we get the size of the rows and columns
        	//of the matrix we wnt to display
        	g = new Generator(n);
        	
        	int matrixDimenssion [] = g.matrixDistribution();
        	int r = matrixDimenssion[1];
        	int c = matrixDimenssion[0];
        	System.out.println(r + " "+c );
        	load(event,r,c, n );
    	}catch(NumberFormatException e) {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Warning ");
    		alert.setHeaderText("You must give an integer as  input");
    		alert.setContentText("Please type an integer and try again!");
    		txtField.clear();
    		alert.showAndWait();
    	}
    }
    
//    private void load(ActionEvent event, int r, int c) {
//    	try {
//    		System.out.println("entraaaa");
//			FXMLLoader loader=new FXMLLoader(getClass().getResource("MatrixWindow.fxml"));
//			Parent root = (Parent) loader.load();
//			root.getStylesheets().add("application.css");//CSS
//			
//			MatrixWindowController nextController=loader.getController();
//			nextController.setDimenssions(c,r);
//			
//			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//			stage.setScene(new Scene(root));
//			
//		
//		}
//		catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		
//	}
    
    
    private void load(ActionEvent event, int r, int c, int n) {
    	try {
    		System.out.println("entraaaa");
			FXMLLoader loader=new FXMLLoader(getClass().getResource("MatrixVisualizerWindow.fxml"));
			Parent root = (Parent) loader.load();
			root.getStylesheets().add("application.css");//CSS
			
			MatrixVisualizerWindowController nextController=loader.getController();
			nextController.setDimenssions(c,r,n);
			
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			
		
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

	@FXML
    void initialize() {
    	
    }

}
