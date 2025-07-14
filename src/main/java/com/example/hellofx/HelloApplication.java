package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Parent root;
        try {
            URL initialFXML = getClass().getResource("/com.example.hellofx/views/Scene01.fxml");
            root = FXMLLoader.load(Objects.requireNonNull(initialFXML));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(NullPointerException | IOException exception) {
            System.out.println("FXML file not found - " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}


