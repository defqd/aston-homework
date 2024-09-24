package models.heroes;

import interfaces.Mortal;
import models.enemies.Enemy;

public abstract class Hero implements Mortal {
    private String name;
    private int strength;
    private int health;

    public Hero(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if(isAlive()) {
            this.health -= damage;
            System.out.printf("%s получил %d ед.урона. ", name, damage);
            System.out.printf("У %s осталось здоровья: %d\n\n", name, health);
        }
        else {
            System.out.printf("%s мертв.\n", name);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
}