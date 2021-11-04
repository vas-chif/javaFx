package com.example.temperatureconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 160);
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);

        javafx.scene.image.Image icon = new javafx.scene.image.Image("file:icon.png");
        stage.getIcons().add(icon);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}