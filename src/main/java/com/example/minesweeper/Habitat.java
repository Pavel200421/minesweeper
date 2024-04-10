package com.example.minesweeper;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class Habitat {
    public static final int Width = 800;
    public static final int Height = 600;

    public Parent createContent() {
        Tile tiler = new Tile(0,0,false);
        Pane root = new Pane();
        root.setPrefSize(Width, Height);
        for (int y = 0; y < tiler.y_tiles; y++) {
            for (int x = 0; x < tiler.x_tiles; x++) {
                Tile tile = new Tile(y,x,Math.random() < 0.2);
                tiler.tilesArr[x][y] = tile;
                root.getChildren().add(tile);
            }
        }
        return root;

    }
}
