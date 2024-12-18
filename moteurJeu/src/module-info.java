module com.example.moteurjeu {
    requires javafx.controls;
    requires javafx.fxml;


    opens moteur to javafx.fxml;
    exports moteur;
    exports steering_astar.Steering;
    exports entites.enemies;
    exports steering_astar.Astar;
}