module com.example.task45 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task45 to javafx.fxml;
    exports com.example.task45;
}