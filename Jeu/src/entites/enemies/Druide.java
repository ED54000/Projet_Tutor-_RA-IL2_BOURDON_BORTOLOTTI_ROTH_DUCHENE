package entites.enemies;

import steering_astar.Steering.Vector2D;

public class Druide extends Ennemy {
    public Druide(Vector2D position, String name) {

        super(position, 100, 3, 10, 1, 2.5, 1,name,"/druide.png", "Healer");

    }
}



