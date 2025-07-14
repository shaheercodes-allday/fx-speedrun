package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Controller {
    private Parent root;
    private Scene scene;
    private Stage stage;

    public void switchToScene01(ActionEvent event) {
        try {
            URL rootUrl = getClass().getResource("/com.example.hellofx/views/Scene01.fxml");
            root = FXMLLoader.load(Objects.requireNonNull(rootUrl));
            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch(IOException | NullPointerException exception) {
            System.out.println("Error while switching window!");
        }
    }

    public void switchToScene02(ActionEvent event) {
        try {
            URL rootUrl = getClass().getResource("/com.example.hellofx/views/Scene02.fxml");
            root = FXMLLoader.load(Objects.requireNonNull(rootUrl));
            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch(IOException | NullPointerException exception) {
            System.out.println("Error while switching window!");
        }
    }
}
