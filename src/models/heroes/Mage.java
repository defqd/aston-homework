package models.heroes;

import models.enemies.Enemy;

public class Mage extends Hero{
    private final static int HEAL = 20;
    private final static int HEAL_POINT = 20;
    public Mage(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("Маг %s атакует!!!\n", getName());
        enemy.takeDamage(getStrength());
    }

    private void useHeal() {
        if(getHealth() <= (getHealth() * HEAL) / 100) {
            System.out.printf("Клирик %s кастует лечение и восстанавливает здоровье.\n", getName());
            setHealth(HEAL_POINT);
        }
    }
}
