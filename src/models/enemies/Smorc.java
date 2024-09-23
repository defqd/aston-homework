package models.enemies;

import models.heroes.Hero;

public class Smorc extends Enemy{
    private final static int RAGE = 20;
    private boolean cooldown = false;

    public Smorc(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackHero(Hero hero) {
        if(hero.isAlive()) {
            if (Math.random() >= 0.5) {
                useAbility();
            }
            else {
                System.out.printf("Четкий пацан %s атакует врага!\n", getName());
                hero.takeDamage(getStrength());
            }
        }
        else {
            System.out.printf("%s мертв!\n", hero.getName());
        }
    }

    @Override
    public void useAbility() {
        if(!cooldown) {
            int addHealth = (getHealth() * 20) / 100;
            int addStrength = (getStrength() * 20) / 100;

            setHealth(getHealth() + addHealth);
            setStrength(getStrength() + addStrength);

            System.out.printf("Четкий пацан %s в ярости. Показатели урона и здоровья увеличены.\n", getName());
        }
    }
}
