package models.heroes;

import models.enemies.Enemy;

public class Archer extends Hero{
    public Archer(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Лучник %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}