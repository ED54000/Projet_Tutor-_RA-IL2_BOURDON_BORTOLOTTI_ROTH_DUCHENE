package com.example.proto_test;

public abstract class Behavior {

    private Vector2D target;

    abstract Vector2D calculateForce(Agent agent);

    public void setTarget(Vector2D target) {
        this.target = target;
    }

    public Vector2D getTarget() {
         return this.target;
    }
}

