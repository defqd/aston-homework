package models.heroes;

import models.enemies.Enemy;

public class Mage extends Hero{
    public Mage(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Маг %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}
