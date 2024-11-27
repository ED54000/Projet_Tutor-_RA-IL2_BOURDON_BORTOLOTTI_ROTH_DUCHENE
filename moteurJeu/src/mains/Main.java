package mains;

import laby.Labyrinth;

import java.io.IOException;


/**
 * charge et affiche un labyrinthe
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // charge le labyrinthe
        Labyrinth laby = new Labyrinth("Ressources/Labyrinthe1.txt");

        //affiche le labyrinthe charge
        for (int y = 0; y < laby.getLengthY(); y++) {
            // affiche la ligne
            for (int x = 0; x < laby.getLength(); x++) {
                //vérifie que la case est = à #
                if (laby.getCase(x, y) == '#')
                    System.out.print('X');
                else
                    System.out.print('.');
            }
            // saut de ligne
            System.out.println();
        }
    }
}
