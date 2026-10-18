module com.joeldroid.multiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.multiplicar to javafx.fxml;
    exports com.joeldroid.multiplicar;
}
