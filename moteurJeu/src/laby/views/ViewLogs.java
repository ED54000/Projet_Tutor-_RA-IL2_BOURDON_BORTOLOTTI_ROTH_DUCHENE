package laby.views;

import entites.enemies.Ennemy;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import laby.ModeleLabyrinth;
import laby.Observer;
import laby.Subject;

public class ViewLogs implements Observer {
    private ModeleLabyrinth laby;
    private VBox logs;

    public ViewLogs(ModeleLabyrinth laby, VBox logs) {
        this.laby = laby;
        this.logs = logs;
    }

    @Override
    public void update(Subject s) {
        if (laby.getLogs()!=""){

            Label label = new Label(laby.getLogs());
            logs.getChildren().add(label);

            laby.setLogs("");
        }
    }
}
