package shelter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPet pet1;
    VirtualPet pet2;
    VirtualPet pet3;
    VirtualPet pet4;
    VirtualPet pet5;


    @BeforeEach
    public void setUp() {
        pet1 = new VirtualPet ("Scruffy", 50, 100, 100, "is happy");
        pet2 = new VirtualPet("Doge", 50, 100, 100, "is sad");
        pet3 = new VirtualPet("Sheba", 50, 100, 100, "is happy");
        pet4 = new VirtualPet("Max", 50, 100, 100, "is moody");
        pet5 = new VirtualPet("Jill", 50, 100, 100, "is active");
    }


    @Test
    public void shouldBeAbleToFeedVirtualPet(){
        pet1.feedVirtualPet();
        assertEquals(49, pet1.getHunger());
    }

    @Test
    public void shouldBeAbleToWaterVirtualPet(){
        pet1.waterVirtualPet();
        assertEquals(49, pet1.getThirst());
    }

    @Test
    public void shouldBeAbleToPlay() {
        pet1.playWithPet();
        assertEquals(98, pet1.getBoredom());
    }

    @Test
    public void shouldBeAbleToGetName(){
        pet1.getName();
        assertEquals("Scruffy", pet1.getName());
    }

    @Test
    public void shouldBeAbleToGetHunger(){
        pet1.getHunger();
        assertEquals(50, pet1.getHunger());
    }

    @Test
    public void shouldBeAbleToGetThirst(){
        pet1.getThirst();
        assertEquals(100, pet1.getThirst());
    }

    @Test
    public void shouldBeAbleToGetBoredom(){
        pet1.getBoredom();
        assertEquals(100, pet1.getBoredom());
    }

    @Test
    public void shouldBeAbleToGetDescription(){
        pet1.getDescription();
        assertEquals("is happy", pet1.getDescription());    }


}
