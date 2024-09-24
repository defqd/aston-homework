package models.enemies;

import models.heroes.Hero;

public class Zombie extends Enemy{
    private boolean isResurrection = false;
    private final static int RESURRECTION_POINTS = 10;

    public Zombie(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.printf("Зомби %s атакует врага!\n", getName());
        hero.takeDamage(getStrength());
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if(!isAlive()) {
            useResurrection();
        }
    }

    private void useResurrection() {
        if(Math.random() >= 0.5 && !isResurrection) {
            setHealth(RESURRECTION_POINTS);

            isResurrection = true;

            System.out.println("Я вернулся из небытия...");
        }
    }
}