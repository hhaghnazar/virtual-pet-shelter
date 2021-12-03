package shelter;

import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {


    public Map<String, VirtualPet> pets = new HashMap<>();

    public void intializePets() {

        VirtualPet x = new VirtualPet("Henry", 50, 50, 50, "He's happy");
        VirtualPet y = new VirtualPet("Lola", 50, 50, 50, "She's rambunctious");
        VirtualPet z = new VirtualPet("Paige", 50, 50, 50, "She's off the wall");

        pets.put(x.getName(), x);
        pets.put(y.getName(), y);
        pets.put(z.getName(), z);

    }

    //has test
    public void add(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }

    //has test
    public void remove(String petToRemove) {
        pets.remove(petToRemove);
    }


    public void feed() {
        for (VirtualPet pets : pets.values()) {
            pets.feedVirtualPet();
        }
    }

    public void water() {
        for (VirtualPet pets : pets.values()) {
            pets.waterVirtualPet();
        }
    }


    public void showPets1() {
        for (VirtualPet pets : pets.values()) {
            System.out.println(pets.getName() + "    \t|    " + pets.getHunger() +
                    "  \t|    " + pets.getThirst() + "    \t|    " +
                    pets.getBoredom());
        }
    }

    public void showPets2() {
        for (VirtualPet pets : pets.values()) {
            System.out.println(pets.getName() + "\t|\t" + pets.getDescription());
        }
    }


}



