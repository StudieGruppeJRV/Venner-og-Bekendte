package presentation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import logic.Ven;

public class CreateGUI {
	private Stage primaryStage;
	private VOBInterface vob;

	public void start(Stage primaryStage, VOBInterface vob) {
		this.primaryStage = primaryStage;
		this.vob = vob;

		primaryStage.setTitle("Create");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(50);
		grid.setVgap(20);
		grid.setPadding(new Insets(100, 100, 100, 100));

		Text scenetitle = new Text("Opret en ny ven");
		scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 50));
		grid.add(scenetitle, 0, 0, 2, 1);

		Scene scene = new Scene(grid, 800, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

		// Fornavn
		TextField firstname = new TextField();
		grid.add(firstname, 0, 3);
		firstname.setAlignment(Pos.BASELINE_LEFT);
		firstname.setFocusTraversable(false);
		firstname.setPromptText("Fornavn");

		// Efternavn 
		TextField lastname = new TextField();
		grid.add(lastname, 0, 4);
		lastname.setAlignment(Pos.BASELINE_LEFT);
		lastname.setFocusTraversable(false);
		lastname.setPromptText("Efternavn");

		//alder
		TextField dateofbirth = new TextField();
		grid.add(dateofbirth, 0, 5);
		dateofbirth.setAlignment(Pos.BASELINE_LEFT);
		dateofbirth.setFocusTraversable(false);
		dateofbirth.setPromptText("fødselsdag");
	
		//Email
		TextField email = new TextField();
		grid.add(email, 0, 6);
		email.setAlignment(Pos.BASELINE_LEFT);
		email.setFocusTraversable(false);
		email.setPromptText("Email");
		
		//by
		TextField city = new TextField();
		grid.add(city, 0, 7);
		city.setAlignment(Pos.BASELINE_LEFT);
		city.setFocusTraversable(false);
		city.setPromptText("By");
		
		//mobilnr
		TextField phonenumber = new TextField();
		grid.add(phonenumber, 0, 8);
		phonenumber.setAlignment(Pos.BASELINE_LEFT);
		phonenumber.setFocusTraversable(false);
		phonenumber.setPromptText("Mobil Nr.");
		
		//Bil
		TextField car = new TextField();
		grid.add(car, 0, 9);
		car.setAlignment(Pos.BASELINE_LEFT);
		car.setFocusTraversable(false);
		car.setPromptText("Bil");

		
		
		
		
		//tilføj knap
		Button add = new Button("Tilføj");
		add.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbadd = new HBox(10);
		hbadd.setAlignment(Pos.BOTTOM_LEFT);
		hbadd.getChildren().add(add);
		grid.add(hbadd, 0, 10);
		add.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Ven ven = new Ven();
				ven.setFirstname(firstname.getText());
				ven.setLastname(lastname.getText());
                ven.setDateOfBirth(dateofbirth.getText());
                ven.setEmail(email.getText());
                ven.setCity(city.getText());
                ven.setPhonenumber(phonenumber.getText());
                ven.setCar(car.getText());
                vob.create(ven);
				
				
			}
		});
		
		
		// Tilbage knap
		Button back = new Button("Tilbage");
		back.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		HBox hbBack = new HBox(10);
		hbBack.setAlignment(Pos.BOTTOM_CENTER);
		hbBack.getChildren().add(back);
		grid.add(hbBack, 2, 10);
		back.setOnAction(e -> back());
	}

	private void back() {
		MenuGUI back = new MenuGUI();
		back.start(primaryStage, vob);

	}
}
