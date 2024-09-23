package models.heroes;

import models.enemies.Enemy;

public class Archer extends Hero{
    public Archer(String name, int strength) {
        super(name, strength);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Лучник %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}
