package org.example.taskmanagerlist;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("C:\\Users\\alexs\\IdeaProjects\\TaskManagerList\\src\\letter_d_PNG13-2884847867.png");
        Label l = new Label("  _______    _____              _     _      _ \n" +
                " |__   __|  |  __ \\            | |   | |    | |\n" +
                "    | | ___ | |  | | ___   __ _| |__ | | ___| |\n" +
                "    | |/ _ \\| |  | |/ _ \\ / _` | '_ \\| |/ _ \\ |\n" +
                "    | | (_) | |__| | (_) | (_| | |_) | |  __/_|\n" +
                "    |_|\\___/|_____/ \\___/ \\__,_|_.__/|_|\\___(_)");

        stage.getIcons().add(icon);
        stage.setTitle("ToDoable!");
        stage.setScene(scene);
        stage.show();
        stage.setHeight(420);
        stage.setWidth(420);
        stage.setResizable(true);


    }

    public static void main(String[] args) {
        launch(args);
    }
}