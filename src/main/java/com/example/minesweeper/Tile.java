package com.example.minesweeper;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tile extends StackPane {
    public static final int Tile = 40;

    Habitat habitat = new Habitat();
    public int x;
    public int y;
    public final int x_tiles = habitat.Width /Tile;
    public final int y_tiles = habitat.Height/Tile;
    public Tile[][] tilesArr = new Tile[x_tiles][y_tiles];

    public boolean hasBomb;
    public Rectangle border = new Rectangle(Tile - 2, Tile - 2);
    public Text text = new Text();
    public Tile (int x, int y, boolean hasBomb) {
        this.x = x;
        this.y = y;
        this.hasBomb = hasBomb;
        border.setStroke(Color.BEIGE);
        text.setText(hasBomb ? "X" : "");
        getChildren().addAll(border,text);
        setTranslateX(x * Tile);
        setTranslateY(y * Tile);
    }
}
