package models.enemies;

import models.heroes.Hero;

public class Smorc extends Enemy{
    private final static int RAGE = 20;
    private final static int EDGE_HEALTH = 50;
    private boolean cooldown = false;

    public Smorc(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.printf("Четкий пацан %s атакует врага!\n", getName());
        hero.takeDamage(getStrength());
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if(getHealth() <= (getHealth() * EDGE_HEALTH) / 100) {
            useRage();
        }
    }

    private void useRage() {
        if(!cooldown) {
            int addHealth = (getHealth() * RAGE) / 100;
            int addStrength = (getStrength() * RAGE) / 100;

            setHealth(getHealth() + addHealth);
            setStrength(getStrength() + addStrength);

            System.out.printf("Четкий пацан %s в ярости. Показатели урона и здоровья увеличены.\n", getName());
        }
    }
}