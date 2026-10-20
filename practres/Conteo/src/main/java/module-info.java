module com.joeldroid.conteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.conteo to javafx.fxml;
    exports com.joeldroid.conteo;
}
