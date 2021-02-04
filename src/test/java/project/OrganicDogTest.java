package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrganicDogTest {

    @Test
    public void organicDogHasAName(){
        //Arrangement + Action
        VirtualPet underTest = new OrganicDog("Spartacus");

        assertThat(underTest.getName()).isEqualTo("Spartacus");
    }

    @Test
    public void organicDogShouldBeWalkable(){
        OrganicPet underTest = new OrganicDog("Spartacus");
        underTest.eat();
        assertThat(underTest.getHunger()).isEqualTo(40);
    }
    @Test
    public void organicDogShouldWalk(){
        Walkable underTest = new OrganicDog("Spartacus");
        underTest.walk();
        VirtualPet dog = (VirtualPet) underTest;
        assertThat(dog.getBoredom()).isEqualTo(0);
    }

}
