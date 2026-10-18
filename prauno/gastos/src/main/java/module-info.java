module com.joeldroid.gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joeldroid.gastos to javafx.fxml;
    exports com.joeldroid.gastos;
}
