package com.example.chemin_interface.entites.enemies;

import com.example.chemin_interface.steering_astar.Steering.Vector2D;

public class Ninja extends Ennemy{

    public Ninja(Vector2D position) {
        super(position, 50, 0.15, 80, 1.5, 1, 4);
    }
}
