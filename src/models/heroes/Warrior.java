package models.heroes;

import models.enemies.Enemy;

public class Warrior extends Hero{
    private final static int CRIT = 2;
    public Warrior(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(Math.random() >= 0.5) {
            int blow = useCripplingBlow();
            enemy.takeDamage(blow);
        }
        else {
            System.out.printf("Воин %s атакует!!!\n", getName());
            enemy.takeDamage(getStrength());
        }
    }

    private int useCripplingBlow() {
        System.out.printf("%s совершает калечащий удар. Урон увеличен на x2.\n", getName());
        return  getStrength() * CRIT;
    }
}