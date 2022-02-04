package com.example.convertero2flow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConverterO2Flow extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ConverterO2Flow.class.getResource("ConverterO2Flow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 440 , 260);
        stage.setTitle("ConverterO2Flow");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}