package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorHello extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorHello.class.getResource("options.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("C:\\Users\\domin\\IdeaProjects\\Calculator\\src\\main\\resources\\Icons\\plus.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.setX(100);
        stage.setY(200);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}