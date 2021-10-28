package dad.holamundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private VBox view;

    @FXML
    private TextField nombreText;

    @FXML
    private Button saludarButton;

    @FXML
    private Label saludoLabel ;

    public Controller() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
        loader.setController(this);
        loader.load();
    }

    public VBox getView() {
        return view;
    }

    public TextField getNombreText() {
        return nombreText;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void onClick(ActionEvent e){
        System.out.println("¡Hola " + getNombreText() + "!");
        }


}
