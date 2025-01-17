package steering_astar.Steering;

import entites.enemies.Ennemy;

public class SeekBehavior extends Behavior {

    /***
     * constructeur de la classe
     * @param target coordonnees de la cible du comportement
     */
    public SeekBehavior(Vector2D target/*, double weight*/) {
        this.setTarget(target);
        /*this.setWeight(weight);*/
    }

    /***
     * implementation du comportement seek, qui tend a atteindre une cible
     * @param ennemy l'ennemi sur lequel va etre applique la force
     * @return les coordonnees sur lesquelles va se baser le calcul de la velocite de l'ennemi
     */
    @Override
    public Vector2D calculateForce(Ennemy ennemy) {
        Vector2D desired = this.getTarget().subtract(ennemy.getPosition()).normalize().scale(ennemy.getMaxSpeed());
        return ((desired.subtract(ennemy.getVelocity())).scale(ACCELERATION_DIVISER))/*.scale(this.getWeight())*/;
    }
}



