package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont(Objects.requireNonNull(
                getClass().getResource("/com.example.hellofx/fonts/Poppins-Regular.ttf")
        ).toExternalForm(), 10);
        Font.loadFont(Objects.requireNonNull(
                getClass().getResource("/com.example.hellofx/fonts/Poppins-Medium.ttf")
        ).toExternalForm(), 10);
        Font.loadFont(Objects.requireNonNull(
                getClass().getResource("/com.example.hellofx/fonts/Poppins-SemiBold.ttf")
        ).toExternalForm(), 10);

        Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass().getResource("/com.example.hellofx/views/HelloApplication.fxml")
        ));
        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);
        stage.show();
    }
}
