module com.example.gigachad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.gigachad to javafx.fxml;
    exports com.example.gigachad;
}