package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class UI02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(
                    Objects.requireNonNull(
                            getClass().getResource("/com.example.hellofx/views/UI02.fxml")
                    )
            );
            String stylesheet = Objects.requireNonNull(
                    getClass().getResource("/com.example.hellofx/assets/style.css")
            ).toString();
            root.getStylesheets().add(stylesheet);
            Scene scene = new Scene(root, 1280, 720, Color.WHITE);
            stage.setScene(scene);
            stage.show();
        } catch (IOException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
