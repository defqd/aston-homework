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
        if(hero.isAlive()) {
            System.out.printf("Зомби %s атакует врага!\n", getName());
            hero.takeDamage(getStrength());
        }
        else {
            System.out.printf("%s мертв!\n", hero.getName());
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if(!isAlive()) {
            useAbility();
        }
    }

    @Override
    public void useAbility() {
        if(isAlive()){
            System.out.println("Я все еще жив...");
            return;
        }
        if(Math.random() >= 0.5 && !isResurrection) {
            setHealth(RESURRECTION_POINTS);

            isResurrection = true;

            System.out.println("Я вернулся из небытия...");
        }
    }
}
