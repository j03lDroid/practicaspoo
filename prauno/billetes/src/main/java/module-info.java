module com.joeldroid.billetes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.billetes to javafx.fxml;
    exports com.joeldroid.billetes;
}
