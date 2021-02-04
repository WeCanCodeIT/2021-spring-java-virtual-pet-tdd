package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoboticDogTest {

    @Test
    public void roboticDogHasName() {
        VirtualPet underTest = new RoboticDog("K-9");
        String name = underTest.getName();
        assertThat(name).isEqualTo("K-9");
    }

    @Test
    public void roboticDogCanBeOiled() {
        // Arrangement
        RoboticPet underTest = new RoboticDog("K-9");
        // Action
        underTest.oil();
        // Assertion
        int oilLevel = underTest.getOilLevel();
        assertThat(oilLevel).isEqualTo(60);
    }
    @Test
    public void roboticDogCanBeOiledMoreThanOnce(){
        RoboticPet underTest = new RoboticDog("K-9");
        underTest.oil();
        underTest.oil();
        assertThat(underTest.getOilLevel()).isEqualTo(70);
    }
    @Test
    public void roboticDogCanGoOnWalks(){
        Walkable underTest = new RoboticDog("K-9");
        underTest.walk();
        int boredom = ((VirtualPet) underTest).getBoredom();
        assertThat(boredom).isEqualTo(10);
    }

}
