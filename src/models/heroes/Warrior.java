package models.heroes;

import models.enemies.Enemy;

public class Warrior extends Hero{
    public Warrior(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Воин %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}
