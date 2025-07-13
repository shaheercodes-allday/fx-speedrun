package com.example.hellofx.controllers;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Controller {
    @FXML
    private Circle myCircle;
    private int a = 0, b = 300;


    public void moveX(ActionEvent e) {
        TranslateTransition move = new TranslateTransition(Duration.seconds(1), myCircle);
        move.setFromX(a);
        move.setToX(b);
        move.play();
        int temp = a;
        a = b;
        b = temp;
    }
}
