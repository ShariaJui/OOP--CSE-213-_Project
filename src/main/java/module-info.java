module com.example.simulating_operations_of_a_dairy_firm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_a_dairy_firm to javafx.fxml;
    exports com.example.simulating_operations_of_a_dairy_firm;
}