package models.enemies;

import models.heroes.Hero;

public class Witch extends Enemy{
    public Witch(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackHero(Hero hero) {
        if(isAlive() && hero.isAlive() && Math.random() >= 0.5) {
            useCurse(hero);
        }
        else {
            System.out.printf("Ведьма %s бьет посохом врага!\n", getName());
            hero.takeDamage(getStrength());
        }
    }

    private void useCurse(Hero hero) {
        int curse = (hero.getHealth() * 50) / 100;
        hero.setHealth(curse);
        System.out.printf("Ведьма %s кастует проклятье. Здоровье %s уменьшено на 50%%.\n", getName(), hero.getName());
    }
}