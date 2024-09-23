package models.heroes;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("Маг %s атакует!!!\n", getName());
    }
}
