package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {

	private Calculadora calc = new Calculadora();

	@FXML
	private BorderPane view;

	@FXML
	private TextField pantalla;

	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/VistaCalculadora.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pantalla.textProperty().bind(calc.getPantallaProperty());
	}

	@FXML
	public void onPonerNumAction(ActionEvent e) {
		char num = ((Button) e.getSource()).getText().charAt(0);
		calc.insertar(num);
	}

	@FXML
	public void onOperarAction(ActionEvent e) {
		char operador = ((Button) e.getSource()).getText().charAt(0);
		calc.operar(operador);
	}

	@FXML
	public void onBorrarAction(ActionEvent e) {
		calc.borrar();
	}

	@FXML
	public void onBorrarTodoAction(ActionEvent e) {
		calc.borrarTodo();
	}

	@FXML
	public void onComaAction(ActionEvent e) {
		calc.insertarComa();
	}

	public Calculadora getCalc() {
		return calc;
	}

	public void setCalc(Calculadora calc) {
		this.calc = calc;
	}

	public BorderPane getView() {
		return view;
	}

	public void setView(BorderPane view) {
		this.view = view;
	}

	public TextField getPantalla() {
		return pantalla;
	}

	public void setPantalla(TextField pantalla) {
		this.pantalla = pantalla;
	}

}
