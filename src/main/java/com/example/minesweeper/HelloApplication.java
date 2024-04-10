package com.example.minesweeper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Создаем экземпляр класса Habitat
        Habitat habitat = new Habitat();

        // Получаем Pane из Habitat
        Pane root = (Pane) habitat.createContent();

        // Создаем экземпляр класса Tile и добавляем его в Pane
        Tile tile = new Tile(0, 0, false); // Пример координат (0, 0) и без бомбы
        root.getChildren().add(tile);

        // Создаем сцену и устанавливаем ее для отображения
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
