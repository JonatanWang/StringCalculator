module com.zyw.stringcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.zyw.stringcalculator to javafx.fxml;
    exports com.zyw.stringcalculator;
}