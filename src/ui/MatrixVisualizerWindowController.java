package ui;

import model.*;
import threads.PaintingField;

import java.util.ArrayList;

import exceptions.BelowTheLimitException;
import exceptions.OffTheLimitException;
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

	private int contador;

	private Generator g;

	private PaintingField pf;

	@FXML
	private BorderPane pane;

	@FXML
	private Button clr;

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
	private Button[][] butons;

	// Set
	public void setDimenssions(int c, int r, int n) {
		this.n = n;
		columns = c;
		rows = r;
		butons = new Button[r][c];
		showFields();
	}

	// this function displays the matrix of numbers
	// starting in 1 until n.
	// Creates a Gridpane dinamically and fills it
	// up with buttons
	public void showFields() {

		int[][] fields = new int[rows][columns];
		grid = new GridPane();
		pane.setCenter(grid);

		// filler is a variable that is used
		// to set the text of each one of the
		// buttons within the matrix
		int filler = 1;

		for (int x = 0; x < fields.length; x++) {// Rows
			RowConstraints row = new RowConstraints();
			row.setVgrow(Priority.ALWAYS);
			grid.getRowConstraints().add(row);
		}
		for (int y = 0; y < fields[0].length; y++) {// Columns
			ColumnConstraints column = new ColumnConstraints();
			column.setHgrow(Priority.ALWAYS);
			grid.getColumnConstraints().add(column);
		}

		for (int x = 0; x < fields.length; x++) {
			for (int y = 0; y < fields[0].length; y++) {
				int i = x;
				int j = y;
				Button field = new Button();
				field.setMaxWidth(Double.MAX_VALUE);
				field.setMaxHeight(Double.MAX_VALUE);
				if (filler <= n) {
					field.setText(filler + "");
				} else {
					field.setText("");
				}

				butons[x][y] = field;

				grid.add(butons[x][y], y, x);

				filler++;
			}
		}

	}

	@FXML
	void Back(ActionEvent event) {
		try {
			System.out.println("entraaaa");
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Parent root = (Parent) loader.load();
			root.getStylesheets().add("application.css");// CSS

			MainWindowController nextController = loader.getController();

			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public int getN() {
		return n;
	}

	// bitwise sieve
	@FXML
	void Prime1(ActionEvent event) throws OffTheLimitException, BelowTheLimitException {

		pf = new PaintingField(this, getN(), 1);

		pf.start();

	}

	// sieve of sundaram
	@FXML
	void Prime2(ActionEvent event) throws OffTheLimitException, BelowTheLimitException {
		// butons[0][0].setStyle("-fx-background-color: Red");
		pf = new PaintingField(this, getN(), 2);

		pf.start();
	}

	// sieve of eratosthenes
	@FXML
	void Prime3(ActionEvent event) throws OffTheLimitException, BelowTheLimitException {
		pf = new PaintingField(this, getN(), 3);

		pf.start();
	}

	public void recibirscene(Generator a) {
		g = a;
	}

	public Button[][] getButons() {
		return butons;
	}

	public void setButons(Button[][] butons) {
		this.butons = butons;
	}



	public void paint(ArrayList<Integer> a, Button z[][]) {
		// button.setStyle("-fx-background-color: #ff0000; ");
		int count = 0;
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[0].length; j++) {
				try {
					if (Integer.parseInt(z[i][j].getText()) == a.get(count)) {
						butons[i][j].setStyle("-fx-background-color: Green");
						count++;
						Thread.sleep(1000);
					} else {
						butons[i][j].setStyle("-fx-background-color: Red");
						Thread.sleep(1000);
					}
				} catch (IndexOutOfBoundsException e) {
					butons[i][j].setStyle("-fx-background-color: Red");
					continue;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	@FXML
    void clear(ActionEvent event) {
		
		for (int i = 0; i<butons.length;i++) {
			for (int j = 0; j < butons[0].length; j++) {
				butons[i][j].setStyle("-fx-background-color: Transparent");
			}
		}
    }

	@FXML

	void initialize() {
	}

}
