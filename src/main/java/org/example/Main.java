package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Se asigna el título de la ventana principal
        stage.setTitle("Alerta Boton");

        // Se crea un botón con el texto "Boton"
        Button boton = new Button("Boton");

        // Se asigna una acción al botón cuando es presionado
        boton.setOnAction(e -> {
            // Se crea una alerta de tipo INFORMATION (información)
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            // Se establece el título de la ventana de alerta
            alert.setTitle("ALERTA");
            // Se establece el contenido/mensaje de la alerta
            alert.setContentText("Has pulsado este boton y ha saltado esta alerta");
            // Se muestra la alerta y se espera a que el usuario la cierre
            alert.showAndWait();
        });

        // Se crea la escena con el botón como único elemento, de 300x300 píxeles
        Scene escena = new Scene(boton, 300, 300);
        // Se asigna la escena a la ventana
        stage.setScene(escena);
        // Se hace visible la ventana
        stage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}