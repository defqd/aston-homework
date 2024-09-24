package models.heroes;

import models.enemies.Enemy;

public class Mage extends Hero{
    private final static int HEAL = 50;
    private final static int HEAL_POINT = 20;
    public Mage(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Маг %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }

    @Override
    public void takeDamage(int damage) {
        int health = getHealth();
        super.takeDamage(damage);
        if(isAlive() && getHealth() <= (health * HEAL) / 100) {
            useHeal();
        }
    }

    private void useHeal() {
        System.out.printf("Клирик %s кастует лечение и восстанавливает здоровье.\n\n", getName());
        setHealth(HEAL_POINT);
    }
}