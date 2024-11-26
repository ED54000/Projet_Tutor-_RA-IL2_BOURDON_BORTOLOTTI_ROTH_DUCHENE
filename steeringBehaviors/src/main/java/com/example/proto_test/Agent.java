package com.example.proto_test;

public class Agent {
    private Vector2D position;
    private Vector2D velocity;
    private double maxSpeed;
    private Behavior behavior; // Le comportement actif de l'agent

    public Agent(Vector2D position, double maxSpeed) {
        this.position = position;
        this.velocity = new Vector2D(0, 0);
        this.maxSpeed = maxSpeed;
        this.behavior = null; // Pas de comportement par défaut
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void update() {
        if (behavior != null) {
            Vector2D steeringForce = behavior.calculateForce(this);
            velocity = velocity.add(steeringForce).normalize().scale(maxSpeed);
            position = position.add(velocity);
        }
    }

    // Getters pour position, vitesse, etc.
    public Vector2D getPosition() { return position; }
    public Vector2D getVelocity() { return velocity; }
    public double getMaxSpeed() { return maxSpeed; }
}

