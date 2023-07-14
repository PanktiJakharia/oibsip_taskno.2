module com.example.atm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.atm to javafx.fxml;
    exports com.example.atm;
}