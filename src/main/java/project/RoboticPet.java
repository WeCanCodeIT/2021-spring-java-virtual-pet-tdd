package project;

public class RoboticPet extends VirtualPet{
    private int oilLevel;

    public RoboticPet(String name) {
        super(name);
        this.oilLevel = 50;
    }

    public void oil() {
        oilLevel += 10;
    }

    public int getOilLevel() {
        return oilLevel;
    }
}
