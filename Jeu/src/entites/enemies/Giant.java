package entites.enemies;

import steering_astar.Steering.Vector2D;

public class Giant extends Ennemy {

    public Giant(Vector2D position, String name) {
        super(position,
                200 + (Math.random() - 0.5) * 40,
                2 + (Math.random() - 0.5),
                30 + (Math.random() - 0.5) * 10,
                0.5 + (Math.random() - 0.5) * 0.2,
                1.5, 1, name,"/giant.png", "Normal");
    }

}
