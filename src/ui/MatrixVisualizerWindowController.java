package ui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class MatrixVisualizerWindowController {

	private int rows = 0;
	private int columns = 0;
	private int n = 0;
	
	@FXML
	private BorderPane pane;

    @FXML
    private Button Prime1_btn;

    @FXML
    private Button Prime2_btn;

    @FXML
    private Button Prime3_btn;

    @FXML
    private Label Label_dimension;

    @FXML
    private Button Back_btn;
    
    private GridPane grid;
    
  //Set
    public void setDimenssions(int c ,int  r, int n){
    	this.n = n;
    	columns = c;
    	rows = r;
    	showFields();
    }
    
    public void showFields() {
    	int [][] fields =new int[rows][columns];
		grid=new GridPane();
		pane.setCenter(grid);
		int filler =1;
		
		for(int x=0; x<fields.length; x++){//Filas
			RowConstraints row=new RowConstraints();
			row.setVgrow(Priority.ALWAYS);
			grid.getRowConstraints().add(row);
		}
		for(int y=0; y<fields[0].length; y++){//Columnas
			ColumnConstraints column=new ColumnConstraints();
			column.setHgrow(Priority.ALWAYS);
			grid.getColumnConstraints().add(column);
		}
		
		for(int x=0; x<fields.length; x++){
			for(int y=0; y<fields[0].length; y++){
				int i=x;
				int j=y;
				Button field=new Button();
				field.setMaxWidth(Double.MAX_VALUE);
				field.setMaxHeight(Double.MAX_VALUE);
				if (filler<=n) {
					field.setText(filler+"");
				}else {
					field.setText("");
				}
				
				grid.add(field, y, x);
				filler++;
			}
		}
		
    }

    @FXML
    void Back(ActionEvent event) {
    	try {
    		System.out.println("entraaaa");
			FXMLLoader loader=new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Parent root = (Parent) loader.load();
			root.getStylesheets().add("application.css");//CSS
			
			MainWindowController nextController=loader.getController();
			
			
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			
		
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    

	

    @FXML
    void Prime1(ActionEvent event) {

    }

    @FXML
    void Prime2(ActionEvent event) {

    }

    @FXML
    void Prime3(ActionEvent event) {

    }


}
