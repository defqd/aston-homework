package models.heroes;

import models.enemies.Enemy;

public class Mage extends Hero{
    public Mage(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(enemy.isAlive()) {
            System.out.printf("Маг %s атакует!!!\n", getName());
            enemy.takeDamage(getStrength());
        }
        else {
            System.out.printf("%s мертв!\n", enemy.getName());
        }
    }
}
