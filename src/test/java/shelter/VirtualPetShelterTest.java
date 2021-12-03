package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest{



    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;
    VirtualPet pet3;
    VirtualPet pet4;
    VirtualPet pet5;
    int hunger = 0;



    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet ("Scruffy", 50, 50, 50, "is happy");
        pet2 = new VirtualPet("Doge", 50, 50, 50, "is sad");
        pet3 = new VirtualPet("Sheba", 50, 50, 50, "is happy");
        pet4 = new VirtualPet("Max", 50, 50, 50, "is moody");
        pet5 = new VirtualPet("Jill", 50, 50, 50, "is active");
    }

    @Test
    public void shouldBeAbleToAddPet() {
        underTest.add(pet2);
        assertEquals(1,underTest.pets.size());
    }

    @Test
    public void shouldBeAbleToRemove(){
        underTest.add(pet2);
        underTest.remove(pet2.getName());
        assertEquals(0,underTest.pets.size());
    }

    @Test
    public void shouldReturnAPetInTheShelter(){
        underTest.add(pet2);
        VirtualPet x = underTest.pets.get("Doge");
        assertEquals(pet2,x);
    }

    @Test
    public void shouldReturnFeedValueAfterFeeding(){
        underTest.add(pet1);
        underTest.feed();
        assertEquals(49, pet1.getHunger());
    }

    @Test
    public void shouldReturnWaterValueAfterWatering(){
        underTest.add(pet1);
        underTest.water();
        assertEquals(49, pet1.getThirst());
    }



}
