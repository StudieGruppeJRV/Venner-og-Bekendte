package presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.VOBInterface;



public class MenuGUI {
	private Stage primaryStage;
	private VOBInterface vob;

	public void start(Stage primaryStage, VOBInterface vob) {
		this.primaryStage = primaryStage;
		this.vob = vob;

		primaryStage.setTitle("Menu");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(30, 30, 30, 30));

		Text scenetitle = new Text("Choose what you wanna do.");
		scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		// Tilføj
		Button btn1 = new Button("Tilføj ny ven"); // CREATE KNAP
		btn1.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn1 = new HBox(10);
		hbBtn1.setAlignment(Pos.BASELINE_LEFT);
		hbBtn1.getChildren().add(btn1);
		grid.add(hbBtn1, 0, 3);
		btn1.setOnAction(e -> create());

		// Læs
		Button btn2 = new Button("Læs om en specifik ven"); // READ KNAP
		btn2.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn2 = new HBox(10);
		hbBtn2.setAlignment(Pos.BASELINE_LEFT);
		hbBtn2.getChildren().add(btn2);
		grid.add(hbBtn2, 0, 4);
		btn2.setOnAction(e -> read());

		// Opdater
		Button btn3 = new Button("Opdatere en vens infomationer"); // READ KNAP
		btn3.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn3 = new HBox(10);
		hbBtn3.setAlignment(Pos.BASELINE_LEFT);
		hbBtn3.getChildren().add(btn3);
		grid.add(hbBtn3, 0, 5);
		btn3.setOnAction(e -> update());

		// slet
		Button btn4 = new Button("Slet en ven"); // READ KNAP
		btn4.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn4 = new HBox(10);
		hbBtn4.setAlignment(Pos.BASELINE_LEFT);
		hbBtn4.getChildren().add(btn4);
		grid.add(hbBtn4, 0, 6);
		btn4.setOnAction(e -> delete());

		// søg
		Button btn5 = new Button("Søg efter specifik info"); // READ KNAP
		btn5.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn5 = new HBox(10);
		hbBtn5.setAlignment(Pos.BASELINE_LEFT);
		hbBtn5.getChildren().add(btn5);
		grid.add(hbBtn5, 0, 7);
		btn5.setOnAction(e -> search());

		// sammelign
		Button btn6 = new Button("Sammenlign venner"); // READ KNAP
		btn6.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn6 = new HBox(10);
		hbBtn6.setAlignment(Pos.BASELINE_LEFT);
		hbBtn6.getChildren().add(btn6);
		grid.add(hbBtn6, 0, 8);
		btn6.setOnAction(e -> compare());

		// Vindue
		Scene scene = new Scene(grid, 800, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void create() {
		CreateGUI Cgui = new CreateGUI();
		Cgui.start(primaryStage, vob);
	}

	private void read() {
		ReadGUI Rgui = new ReadGUI();
		Rgui.start(primaryStage);

	}

	private void update() {
		UpdateGUI Ugui = new UpdateGUI();
		Ugui.start(primaryStage);

	}
	
	private void delete() {
		DeleteGUI Dgui = new DeleteGUI();
		Dgui.start(primaryStage);
	}
	
	private void search() {
		SearchGUI Sgui = new SearchGUI();
		Sgui.start(primaryStage);
	}
	
	private void compare() {
		CompareGUI Cgui = new CompareGUI();
		Cgui.start(primaryStage);
	}
}
