package com.summertech2026;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * A simple JavaFX animation examples. Animates a Circle's X property by translating (moving) it 200 points
 * over 10 seconds.
 */

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws FileNotFoundException {

        Circle circle = new Circle(50, 150, 50, Color.PINK);

        // change circle.translateXProperty from it's current value to 200
        KeyValue keyValue = new KeyValue(circle.translateXProperty(), 200);

        // over the course of 5 seconds
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(10), keyValue);
        Timeline timeline = new Timeline(keyFrame);

        Scene scene = new Scene(new Pane(circle), 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        timeline.play();
    }
}