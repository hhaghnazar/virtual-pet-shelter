package shelter;


public class VirtualPet {
    private int petID;
    private String petName;
    private int hunger;
    private int thirst;
    private int boredom;
    private String description;

    String animalName;
    int animalHunger;
    int animalThirst;
    int animalBoredom;
    String animalDescription;


    public VirtualPet(String petName, int hunger, int thirst, int boredom, String description) {
        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.description = description;
    }


    public String getName() {
        return petName;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public String getDescription() {
        return description;
    }


    public void playWithPet() {
        hunger++;
        thirst++;
        boredom -= 2;
    }

    public void feedVirtualPet() {
        hunger--;
    }

    public void waterVirtualPet() {
        thirst--;
    }


}
