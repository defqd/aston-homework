package models.heroes;

import models.enemies.Enemy;

public class Archer extends Hero{
    private final static int CRIT = 20;
    public Archer(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(Math.random() >= 0.5) {
            int shot = usePowerShot();
            enemy.takeDamage(shot);
        }
        else {
            System.out.printf("Лучник %s атакует!!!\n", getName());
            enemy.takeDamage(getStrength());
        }
    }

    private int usePowerShot() {
        System.out.printf("%s находит слабые места в броне противника и наносит критический удар. ", getName());
        return getStrength() + ((getStrength() * CRIT) / 100);
    }
}