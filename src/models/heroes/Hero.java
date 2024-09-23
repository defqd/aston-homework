package models.heroes;

import models.enemies.Enemy;

public class Hero {
    private String name;
    private int strength;

    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public  void attackEnemy(Enemy enemy) {
        System.out.printf("%s атакует!!!\n", name);
        enemy.takeDamage(strength);
    }
}
