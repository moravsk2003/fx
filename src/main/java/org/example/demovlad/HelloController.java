package org.example.demovlad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button tet;
    @FXML
    private Button tet2;

    @FXML
    void new_Alert(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("ed.fxml"));
        try {
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            stage.setScene(scene);

            stage.setMaxHeight(300);
            stage.setMaxWidth(300);
            stage.setTitle("Hello!");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(tet.getScene().getWindow());

            stage.show();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void new_Alert2(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Видалення");

        alert.setHeaderText("Results:");
        alert.setContentText("Видалення може призвести до зміни порядку осіб у  Адресній книзі! ");

        alert.showAndWait();

    }

}