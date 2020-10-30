package presentation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.VOBInterface;
import logic.Venner;

public class MainVB extends Application {
	private Stage primaryStage;
	private VOBInterface vob = new Venner();

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;


		// overskrift
		primaryStage.setTitle("Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Text scenetitle = new Text("    Velkommen");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
		grid.add(scenetitle, 0, 0, 2, 1);
		Label tilTitel = new Label("                til");
		grid.add(tilTitel, 0, 2);
		tilTitel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
		Label venTitel = new Label("Venner og Bekendte");
		grid.add(venTitel, 0, 3);
		venTitel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));

		Scene scene = new Scene(grid, 800, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
			
		// Start Knap
		Button begin = new Button("Start");
		begin.setFont(Font.font("Calibri", FontWeight.NORMAL, 25));
		HBox hbBtn = new HBox(25);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(begin);
		grid.add(hbBtn, 1, 4);
		begin.setOnAction(e -> begin());

	}

	private void begin() {
		MenuGUI begin = new MenuGUI();
		begin.start(primaryStage, vob);
	}
}
