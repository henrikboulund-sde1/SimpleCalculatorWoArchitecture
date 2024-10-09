module dk.easv.simplecalculator01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.simplecalculator01 to javafx.fxml;
    exports dk.easv.simplecalculator01;
}