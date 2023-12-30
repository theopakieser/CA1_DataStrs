module com.example.ca1_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires xstream;


    opens com.example.ca1_2 to javafx.fxml;
    exports com.example.ca1_2;

}