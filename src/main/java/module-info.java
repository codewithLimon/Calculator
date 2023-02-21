module com.example.masud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.masud to javafx.fxml;
    exports com.example.masud;
}