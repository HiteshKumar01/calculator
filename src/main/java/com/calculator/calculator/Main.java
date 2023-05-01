package com.calculator.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    public static void showScene(Scene scene, Stage stage) {

        stage.setScene(scene);

//        stage.setResizable(Boolean.TRUE);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CalculatorFXML.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
//        Scene scene = new Scene(parent, 1920, 1080);
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/FXML/CalculatorFXML.fxml")));
        Scene scene = new Scene(parent, 500, 500);
        stage.setTitle("Welcome to the Application");
//        stage.setScene(scene);
        showScene(scene, stage);
        stage.resizableProperty().setValue(Boolean.FALSE);
//        stage.show();
        System.out.println("Application Starting......");
    }
    @Override
    public void stop() throws Exception {
        System.out.println("Application Stoppped......");
    }

    public static void main(String[] args) {

        launch();

    }
}