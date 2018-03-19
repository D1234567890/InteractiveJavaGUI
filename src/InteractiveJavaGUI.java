import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InteractiveJavaGUI extends Application {

	public VBox root;
	public Scene scene;
	public Label label;
	public Button add;
	public Button remove;
	public Button change;
	public Button promote;
	
	public Level level0;
	public Level level1;
	public Level level2;
	public Level level3;
	public Level level4;
	public Level level5;
	public Level level6;
	public Level level7;
	public Level level8;
	public Level level9;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		root = new VBox();
		scene = new Scene(root, 500, 1000);
		
		add = new Button("Add Name");
		remove = new Button("Remove Name");
		change = new Button("Change name");
		promote = new Button("Promote Name");

		add.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				TextInputDialog textInputDialog = new TextInputDialog("Please enter a new name followed by the level:");
				
				Optional<String> newName = textInputDialog.showAndWait();
				
				int level = Integer.parseInt(newName.get().substring(newName.get().indexOf(" ") + 1, newName.get().length()));
				
				switch(level) {
				case 0: 
					break;
				}
			}

		});

		change.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

			}

		});
		
		root.getChildren().add(add);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
