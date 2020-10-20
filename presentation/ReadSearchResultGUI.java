package presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.VOBInterface;
import logic.Ven;
import logic.Venner;

public class ReadSearchResultGUI {
//private VOBInterface vob = new Venner();
public void search(Stage primaryStage)  {
		primaryStage.setTitle("ReadResult");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(50);
		grid.setVgap(20);
		grid.setPadding(new Insets(100, 100, 100, 100));
		Text scenetitle = new Text("det virker");
		scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 30));
		grid.add(scenetitle, 0, 0, 2, 1);
		Scene scene = new Scene(grid, 800, 700);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		TextField sven = new TextField();
		grid.add(sven, 0, 3);
		sven.setAlignment(Pos.BASELINE_CENTER);
	}
}