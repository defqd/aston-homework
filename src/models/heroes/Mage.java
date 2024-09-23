package models.heroes;

import models.enemies.Enemy;

public class Mage extends Hero{
    public Mage(String name, int strength) {
        super(name, strength);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Маг %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}
