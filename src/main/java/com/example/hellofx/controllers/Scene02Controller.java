package com.example.hellofx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene02Controller {
    @FXML
    private Label helloLabel;

    public void displayHelloMessage(String name) {
        helloLabel.setText("Hello, " + name + "!");
    }
}
