module org.example.demovlad {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demovlad to javafx.fxml;
    exports org.example.demovlad;
}