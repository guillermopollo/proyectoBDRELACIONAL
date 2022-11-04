module com.mycompany.bd_relacional {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    requires javafx.base;

    opens com.mycompany.bd_relacional to javafx.fxml;
    exports com.mycompany.bd_relacional;
    
}
