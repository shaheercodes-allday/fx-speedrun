package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
            Font.loadFont(Objects.requireNonNull(
                    getClass().getResource("/com.example.hellofx/fonts/Poppins-Regular.ttf")
            ).toExternalForm(), 10);
            Font.loadFont(Objects.requireNonNull(
                    getClass().getResource("/com.example.hellofx/fonts/Poppins-Medium.ttf")
            ).toExternalForm(), 10);
            Font.loadFont(Objects.requireNonNull(
                    getClass().getResource("/com.example.hellofx/fonts/Poppins-SemiBold.ttf")
            ).toExternalForm(), 10);

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
            stage.setTitle("Venture");
            stage.show();
        } catch (IOException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
