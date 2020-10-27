package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controller controller;	

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();

		Scene scene = new Scene(controller.getView(), 600, 420);
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
