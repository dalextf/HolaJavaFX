package dad.holamundo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.naming.NamingEnumeration;
import java.awt.*;

public class HolaMunddoApp extends Application {

    private Label saludoLabel;
    private Button saludarButton;
    private TextField nombreText;
    private VBox rootPanel;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Creamos el cuadro de texto
        nombreText = new TextField();
        nombreText.setPromptText("Introduce un nombre");
        nombreText.setMaxWidth(150);

        // Creamos una etiqueta
        saludoLabel = new Label();
        saludoLabel.setText("Aquí saldrá el texto");


        // Creamos el botón
        saludarButton = new Button();
        saludarButton.setText("Saludar");

        // Creamos el panel con disposición vertical
        rootPanel = new VBox();
        rootPanel.setSpacing(15);
        rootPanel.setAlignment(Pos.CENTER);
        rootPanel.getChildren().addAll(nombreText, saludoLabel, saludarButton);

        // Añadimos la escena
        Scene scene = new Scene(rootPanel,320,200);

        primaryStage.setTitle("Hola Mundo Mejorado");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
