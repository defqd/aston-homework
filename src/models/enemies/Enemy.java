package models.enemies;

import interfaces.Mortal;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.printf("получает %d ед.урона.\n", damage);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
