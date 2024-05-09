module com.example.bai_tap_mahoa {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.bai_tap_mahoa to javafx.fxml;
    exports com.example.bai_tap_mahoa;
}