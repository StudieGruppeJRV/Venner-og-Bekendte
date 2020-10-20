package presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.VOBInterface;
import logic.Venner;

public class ReadGUI {
	private Stage primaryStage;
	private VOBInterface vob = new Venner();
	
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		

		primaryStage.setTitle("Read");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(50);
		grid.setVgap(20);
		grid.setPadding(new Insets(100, 100, 100, 100));

		Text scenetitle = new Text("Søg på ven du vil læse om");
		scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 30));
		grid.add(scenetitle, 0, 0, 2, 1);

		Scene scene = new Scene(grid, 800, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//TextFelt
		TextField søg = new TextField();
		søg.setFocusTraversable(false);
		søg.setPromptText("Søg");
		grid.add(søg, 0, 3);
		søg.setAlignment(Pos.BASELINE_LEFT);
		
		// SøgKnap
		Button search = new Button("søg"); 
		search.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBtn1 = new HBox(10);
		hbBtn1.setAlignment(Pos.BASELINE_LEFT);
		hbBtn1.getChildren().add(search);
		grid.add(hbBtn1, 0, 4);
		
		
		
		// Tilbage knap
		Button back = new Button("Tilbage");
		back.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBack = new HBox(10);
		hbBack.setAlignment(Pos.BOTTOM_LEFT);
		hbBack.getChildren().add(back);
		grid.add(hbBack, 0, 10);
		back.setOnAction(e -> back());

	}
	private void back () {
		MenuGUI back = new MenuGUI();
		back.start(primaryStage, vob);
	}

}
