module com.joeldroid.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.edad to javafx.fxml;
    exports com.joeldroid.edad;
}
