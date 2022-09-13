module group3.cs325_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens group3.cs325_project to javafx.fxml;
    exports group3.cs325_project;
}
