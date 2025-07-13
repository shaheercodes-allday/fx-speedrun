package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void moveX(ActionEvent e) {
        myCircle.setCenterX(x+=3);
    }
}
