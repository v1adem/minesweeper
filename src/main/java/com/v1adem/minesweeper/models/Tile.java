package com.v1adem.minesweeper.models;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Tile extends Button {
        private boolean flagged = false;
        private final boolean mine;
        private int value = 0;
        private final int x, y;

        Tile(int x, int y, int value, boolean mine){
                this.x = x;
                this.y = y;

                this.mine = mine;

                this.setPrefSize(24,24);
                Image img = new Image("resources/img/close.png");
                ImageView view = new ImageView(img);
                view.setFitHeight(24);
                this.setGraphic(view);
        }

        public boolean disable(){
                this.setDisable(true);

                if (mine){
                        Image img = new Image("resources/img/explode.png");
                        ImageView view = new ImageView(img);
                        view.setFitHeight(24);
                        this.setGraphic(view);
                        return true;
                }
                else if (value > 0){
                        Image img = new Image("resources/img/{value}.png");
                        ImageView view = new ImageView(img);
                        view.setFitHeight(24);
                        this.setGraphic(view);
                }
                return false;
        }
        public boolean isFlagged() {
                return flagged;
        }

        public void setFlagged(boolean flagged) {
                this.flagged = flagged;
                Image img = new Image("resources/img/flag.png");
                ImageView view = new ImageView(img);
                view.setFitHeight(24);
                this.setGraphic(view);
        }

        public int getX() {
                return x;
        }

        public int getY() {
                return y;
        }

        public int getValue() {
                return value;
        }

        public void setValue(int value) {
                this.value = value;
        }
}
