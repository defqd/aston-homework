package models.heroes;

import models.enemies.Enemy;

public class Warrior extends Hero{
    public Warrior(String name, int strength) {
        super(name, strength);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Воин %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }
}
