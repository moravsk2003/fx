package org.example.demovlad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        scene.getStylesheets().add(HelloApplication.class.getResource("my.css").toExternalForm());
        stage.setScene(scene);

        stage.setMinHeight(400);
        stage.setMinWidth(400);
        stage.setTitle("адресна книга");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}