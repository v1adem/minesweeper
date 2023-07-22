package com.v1adem.minesweeper.models;

public class Board {
    private final int rows;
    private final int columns;
    private final int bombs;



    Board(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        // There is the formula. Specifically, expert has 99 mines
        // and 480 total squares (16 * 30). 480/99 = 4.85.
        // Practically that means that there’s one mine for every 5 squares.
        this.bombs = (rows * columns)/5;
    }
}
