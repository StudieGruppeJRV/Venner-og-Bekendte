package presentation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.VOBInterface;
import logic.Ven;
import logic.Venner;

import java.util.List;
import java.util.stream.Collectors;

public class UpdateGUI {
	private Stage primaryStage;
	private VOBInterface vob = new Venner();

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		primaryStage.setTitle("Update");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(50);
		grid.setVgap(20);
		grid.setPadding(new Insets(100, 100, 100, 100));

		Text scenetitle = new Text("Opdater en ven");
		scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 50));
		grid.add(scenetitle, 0, 0, 2, 1);

		Scene scene = new Scene(grid, 800, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

		ListView<String> listView = new ListView<String>();
		for (String fname : vob.getFirstnameList()){
			listView.getItems().addAll(fname);
		}

		// Tilbage knap
		Button back = new Button("Tilbage");
		back.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBack = new HBox(10);
		hbBack.setAlignment(Pos.BOTTOM_LEFT);
		hbBack.getChildren().add(back);
		grid.add(hbBack, 0, 10);
		back.setOnAction(e -> back());
	}

	private void back() {
		presentation.MenuGUI back = new MenuGUI();
		back.start(primaryStage, vob);
	}

}
