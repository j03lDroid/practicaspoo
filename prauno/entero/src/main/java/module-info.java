module com.joeldroid.entero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.entero to javafx.fxml;
    exports com.joeldroid.entero;
}
