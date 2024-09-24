package models.enemies;

import interfaces.Mortal;
import models.heroes.Hero;

public abstract class Enemy implements Mortal {
    private String name;
    private int strength;
    private int health;

    public Enemy(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return  name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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

    public abstract void attackHero(Hero hero);
}