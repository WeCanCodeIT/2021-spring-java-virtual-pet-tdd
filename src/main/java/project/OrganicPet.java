package project;

public class OrganicPet extends VirtualPet{
    private int hunger;

    public OrganicPet(String name) {
        super(name);
        this.hunger = 50;
    }

    public void eat() {
        hunger -=10;
    }

    public int getHunger() {
        return hunger;
    }
}
