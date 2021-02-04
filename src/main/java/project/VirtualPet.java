package project;

public class VirtualPet {
    private String name;
    protected int boredom;

    public VirtualPet(String name) {
        this.name = name;
        this.boredom = 50;
    }


    public String getName() {
        return name;
    }

    public int getBoredom() {
        return boredom;
    }
}
