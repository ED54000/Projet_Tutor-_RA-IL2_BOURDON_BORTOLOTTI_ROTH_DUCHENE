package com.example.steering_astar.Steering;

import java.util.ArrayList;

public class Vector2D {
    public double x, y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public Vector2D subtract(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public Vector2D scale(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    public double magnitude() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2D normalize() {
        double mag = magnitude();
        return mag == 0 ? new Vector2D(0, 0) : scale(1 / mag);
    }

    public double distanceTo(Vector2D other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double[] getCloserPairIndex(char[][] grid, char target) throws Exception {
        ArrayList<Vector2D> PairIndex = new ArrayList<>();
        for (int row = 0; row < grid.length; row++) {
            // Iterate through each column in the current row
            for (int col = 0; col < grid[row].length; col++) {
                // Check if the current cell matches the target character
                if (grid[row][col] == target) {
                    PairIndex.add(new Vector2D(row, col));
                }
            }
        }
        if (PairIndex.isEmpty()) {
            throw new Exception("Character '" + target + "' not found in the grid");
        }
       Vector2D closest = PairIndex.getFirst();
        for (int i = 1; i < PairIndex.size(); i++) {
            closest = getCloser(PairIndex.get(i), closest);
        }
        return new double[]{closest.x, closest.y};
    }

    public static int[] getPairIndex(char[][] grid, char target) throws Exception {
        // Iterate through each row
        for (int row = 0; row < grid.length; row++) {
            // Iterate through each column in the current row
            for (int col = 0; col < grid[row].length; col++) {
                // Check if the current cell matches the target character
                if (grid[row][col] == target) {
                    // Return the indices as an array
                    return new int[]{row, col};
                }
            }
        }

        // Throw an exception if the character is not found
        throw new Exception("Character '" + target + "' not found in the grid");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return Double.compare(x, vector2D.x) == 0 && Double.compare(y, vector2D.y) == 0;
    }


    private static Vector2D getCloser(Vector2D p1, Vector2D p2) {
        if (p1.y < p2.y) {
            return p1;
        } else
            return p2;
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

