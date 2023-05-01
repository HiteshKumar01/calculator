module com.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.calculator.calculator to javafx.fxml;
    exports com.calculator.calculator;
}