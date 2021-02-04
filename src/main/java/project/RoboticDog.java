package project;

public class RoboticDog extends RoboticPet implements Walkable {
    public RoboticDog(String name) {
        super(name);
    }

    @Override
    public void walk() {
        boredom -= 40;
    }
}
