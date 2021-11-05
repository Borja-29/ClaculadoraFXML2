package calculadorafxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controlador implements Initializable{

	// Modelo
	private Calculadora calculadora = new Calculadora();
	
	// Vista
	@FXML
	private GridPane root;
	
	@FXML
	private TextField resText;
	
	@FXML
	private Button boton1;
	@FXML
	private Button boton2;
	@FXML
	private Button boton3;
	@FXML
	private Button boton4;
	@FXML
	private Button boton5;
	@FXML
	private Button boton6;
	@FXML
	private Button boton7;
	@FXML
	private Button boton8;
	@FXML
	private Button boton9;
	@FXML
	private Button boton0;
	@FXML
	private Button botonMultiplicar;
	@FXML
	private Button botonDividir;
	@FXML
	private Button botonRestar;
	@FXML
	private Button botonsumar;
	@FXML
	private Button botonIgual;
	@FXML
	private Button botonBorrar;
	@FXML
	private Button botonBorrarTodo;
	@FXML
	private Button botonDecimal;
	
	public Controlador() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Vista.fxml"));
		
		loader.setController(this);
		loader.load();
	}
	
	public GridPane getView() {
		return root;
	}
	

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		resText.textProperty().bind(calculadora.getResultado());
		
	}

	@FXML
	public void onPulsarAction(ActionEvent e) {
		
		Button seleccionado = (Button)e.getSource();
		
		switch (seleccionado.textProperty().getValue()) {
		case "1":
			calculadora.insertar('1');
			break;
		case "2":
			calculadora.insertar('2');
			break;
		case "3":
			calculadora.insertar('3');
			break;
		case "4":
			calculadora.insertar('4');
			break;
		case "5":
			calculadora.insertar('5');
			break;
		case "6":
			calculadora.insertar('6');
			break;
		case "7":
			calculadora.insertar('7');
			break;
		case "8":
			calculadora.insertar('8');
			break;
		case "9":
			calculadora.insertar('9');
			break;
		case "0":
			calculadora.insertar('0');
			break;
		case "C":
			calculadora.borrar();
			break;
		case "CE":
			calculadora.borrarTodo();
			break;
		case "+":
			calculadora.operar(Calculadora.SUMAR);
			break;
		case "-":
			calculadora.operar(Calculadora.RESTAR);
			break;
		case "*":
			calculadora.operar(Calculadora.MULTIPLICAR);
			break;
		case "/":
			calculadora.operar(Calculadora.DIVIDIR);
			break;
		case "=":
			calculadora.operar(Calculadora.IGUAL);
			break;
		case ".":
			calculadora.insertarComa();
			break;
		default:
			break;
		}
	}

	
}