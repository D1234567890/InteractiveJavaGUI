import java.util.HashMap;
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

	private VBox root;
	private VBox root0;
	private VBox root1;
	private VBox root2;
	private VBox root3;
	private VBox root4;
	private VBox root5;
	private VBox root6;
	private VBox root8;
	private VBox root7;

	private Scene scene0;
	private Scene scene1;
	private Scene scene3;
	private Scene scene2;
	private Scene scene4;
	private Scene scene5;
	private Scene scene6;
	private Scene scene7;
	private Scene scene8;

	private Scene scene;
	private Button add;
	private Button remove;
	private Button change;
	private Button promote;

	private int key = 3;

	HashMap<Integer, Name> names = new HashMap<Integer, Name>();

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {

		Stage level0Stage = new Stage();
		Stage level1Stage = new Stage();
		Stage level2Stage = new Stage();
		Stage level3Stage = new Stage();
		Stage level4Stage = new Stage();
		Stage level5Stage = new Stage();
		Stage level6Stage = new Stage();
		Stage level7Stage = new Stage();
		Stage level8Stage = new Stage();

		root = new VBox();
		root0 = new VBox();
		root1 = new VBox();
		root2 = new VBox();
		root3 = new VBox();
		root4 = new VBox();
		root5 = new VBox();
		root6 = new VBox();
		root7 = new VBox();
		root8 = new VBox();

		scene = new Scene(root, 500, 1000);
		scene0 = new Scene(root0, 500, 500);
		scene1 = new Scene(root1, 500, 500);
		scene2 = new Scene(root2, 500, 500);
		scene3 = new Scene(root3, 500, 500);
		scene4 = new Scene(root4, 500, 500);
		scene5 = new Scene(root5, 500, 500);
		scene6 = new Scene(root6, 500, 500);
		scene7 = new Scene(root7, 500, 500);
		scene8 = new Scene(root8, 500, 500);

		add = new Button("Add Name");
		remove = new Button("Remove Name");
		change = new Button("Change name");
		promote = new Button("Promote Name");

		add.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				TextInputDialog textInputDialog = new TextInputDialog("NEW NAME");
				Optional<String> newName = textInputDialog.showAndWait();

				textInputDialog = new TextInputDialog("NEW LEVEL");
				Optional<String> levelOfName = textInputDialog.showAndWait();
				int level = Integer.parseInt(levelOfName.get());

				Name name = new Name(level, newName.get());
				names.put(key, name);
				key++;

				switch (level) {
				case 0:
					root0.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 1:
					root1.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 2:
					root2.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 3:
					root3.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 4:
					root4.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 5:
					root5.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 6:
					root6.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 7:
					root7.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				case 8:
					root8.getChildren().add(new Label(name.getName() + ", Level " + name.getLevel()));
					break;
				}
			}

		});

		change.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				TextInputDialog textInputDialog = new TextInputDialog("SEARCH THIS NAME");
				Optional<String> searchName = textInputDialog.showAndWait();

				textInputDialog = new TextInputDialog("NEW NAME");
				Optional<String> newName = textInputDialog.showAndWait();

				textInputDialog = new TextInputDialog("NEW LEVEL");
				Optional<String> newLevel = textInputDialog.showAndWait();

				for (int key : names.keySet()) {
					if (names.get(key).getName().equalsIgnoreCase(searchName.get())) {
						names.get(key).setName(newName.get());
						names.get(key).setLevel(Integer.parseInt(newLevel.get()));
						switch (names.get(key).getLevel()) {
						case 0:
							root0.getChildren().remove(key);
							root0.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 1:
							root1.getChildren().remove(key);
							root1.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 2:
							root2.getChildren().remove(key);
							root2.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 3:
							root3.getChildren().remove(key);
							root3.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 4:
							root4.getChildren().remove(key);
							root4.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 5:
							root5.getChildren().remove(key);
							root5.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 6:
							root6.getChildren().remove(key);
							root6.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 7:
							root7.getChildren().remove(key);
							root7.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						case 8:
							root8.getChildren().remove(key);
							root8.getChildren()
									.add(new Label(names.get(key).getName() + ", Level " + names.get(key).getLevel()));
							break;
						}
					}
				}
			}

		});

		remove.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				TextInputDialog textInputDialog = new TextInputDialog("SEARCH THIS NAME");
				Optional<String> searchName = textInputDialog.showAndWait();

				for (int key : names.keySet()) {
					if (names.get(key).getName().equalsIgnoreCase(searchName.get())) {
						switch (names.get(key).getLevel()) {
						case 0:
							root0.getChildren().remove(key);
							break;
						case 1:
							root1.getChildren().remove(key);
							break;
						case 2:
							root2.getChildren().remove(key);
							break;
						case 3:
							root3.getChildren().remove(key);
							break;
						case 4:
							root4.getChildren().remove(key);
							break;
						case 5:
							root5.getChildren().remove(key);
							break;
						case 6:
							root6.getChildren().remove(key);
							break;
						case 7:
							root7.getChildren().remove(key);
							break;
						case 8:
							root8.getChildren().remove(key);
							break;
						}
					}
				}
			}

		});

		root.getChildren().add(add);
		root.getChildren().add(change);
		root.getChildren().add(remove);

		primaryStage.setScene(scene);
		primaryStage.show();
		level0Stage.setScene(scene0);
		level0Stage.show();
		level1Stage.setScene(scene1);
		level1Stage.show();
		level2Stage.setScene(scene2);
		level2Stage.show();
		level3Stage.setScene(scene3);
		level3Stage.show();
		level4Stage.setScene(scene4);
		level4Stage.show();
		level5Stage.setScene(scene5);
		level5Stage.show();
		level6Stage.setScene(scene6);
		level6Stage.show();
		level7Stage.setScene(scene7);
		level7Stage.show();
		level8Stage.setScene(scene8);
		level8Stage.show();
	}
}
