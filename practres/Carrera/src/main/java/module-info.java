module com.joeldroid.carrera {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.carrera to javafx.fxml;
    exports com.joeldroid.carrera;
}
