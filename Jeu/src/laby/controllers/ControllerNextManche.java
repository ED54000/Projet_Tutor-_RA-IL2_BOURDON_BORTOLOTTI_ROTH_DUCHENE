package laby.controllers;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import laby.ModeleLabyrinth;

public class ControllerNextManche implements EventHandler<MouseEvent> {

    ModeleLabyrinth laby;

    public ControllerNextManche(ModeleLabyrinth laby) {
        this.laby = laby;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

        //clear les logs si on est pas en simulation
        if (!laby.estSimulation()) {
            VBox parentVBox = (VBox) ((Button) mouseEvent.getSource()).getParent();
            parentVBox.getChildren().clear();

            int nbManches = laby.getNbManches()+1;
            parentVBox.getChildren().add(new Label("Manche " + nbManches));

        }

        laby.setPause(false);
        laby.setNbManches(laby.getNbManches() + 1);
    }
}
