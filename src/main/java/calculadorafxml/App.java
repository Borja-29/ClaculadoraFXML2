package calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controlador controladorCalculadora;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controladorCalculadora = new Controlador();
		
		Scene scene = new Scene(controladorCalculadora.getView());
		
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}