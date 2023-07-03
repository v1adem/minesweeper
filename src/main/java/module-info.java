module com.v1adem.minesweeper {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.v1adem.minesweeper to javafx.fxml;
    exports com.v1adem.minesweeper;
}