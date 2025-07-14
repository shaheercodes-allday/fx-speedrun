package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField nameTextField;

    public void login(ActionEvent event) {
        try {
            String name = nameTextField.getText();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.example.hellofx/views/Scene02.fxml"));
            Parent root = loader.load();

            Scene02Controller scene02Controller = loader.getController();
            scene02Controller.displayHelloMessage(name);

            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch(IOException | NullPointerException exception) {
            System.out.println("Error while switching window - " + exception.getMessage());
        }
    }
}
