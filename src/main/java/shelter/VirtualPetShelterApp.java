package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userChoice;
        String userChoice2;
        int tick = 0;

        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.intializePets();

        System.out.println("Welcome to the Pet Playground & Palace");
        System.out.println("+-------------------------------------+");
        System.out.println("|     ____      ____     ____         |");
        System.out.println("|    |     )   |     )  |     )       |");
        System.out.println("|    | ___/    | ___/   | ___/        |");
        System.out.println("|    |         |        |             |");
        System.out.println("|    |         |        |             |");
        System.out.println("|    |         |        |             |");
        System.out.println("+-------------------------------------+");
        System.out.println("");

        System.out.println("Here is the status of your pets: ");

        System.out.println("Pet Name\t|\tHunger\t|\tThirst\t|\tBoredom");
        System.out.println("___________________________________________________");

        myShelter.showPets1();

        System.out.println("___________________________________________________");
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("Please select from the menu below");
        System.out.println(" ");
        System.out.println("Press 1 to Feed the pets");
        System.out.println("Press 2 to Give water to the pets");
        System.out.println("Press 3 to Play with a pet");
        System.out.println("Press 4 to Adopt a pet");
        System.out.println("Press 5 to Admit a pet");
        System.out.println("Press 6 to exit");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        userChoice = input.nextLine();
        while (!userChoice.equals("6")) {
            if (userChoice.equals("1")) {
                tick++;
                System.out.println("");
                System.out.println("You have chosen feed the pets");
                System.out.println("");

                myShelter.feed();
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!");
                System.out.println("");
            } else if (userChoice.equals("2")) {
                tick++;
                System.out.println("");
                System.out.println("You have chosen to give the pets some water");
                System.out.println("");

                myShelter.water();
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!");
                System.out.println("");
            } else if (userChoice.equals("3")) {
                tick++;
                System.out.println(" ");
                System.out.print("You want to play with one of your pets");
                System.out.println("");
                System.out.println("Pet Name  \t|\tDescription");
                System.out.println("___________________________________________________");
                myShelter.showPets2();

                System.out.println("___________________________________________________");
                System.out.println("Enter the name of the pet you would like to play with: ");
                userChoice2 = input.nextLine();
                myShelter.pets.get(userChoice2).playWithPet();
                System.out.println("");
                System.out.println("You have just played with " + userChoice2 + " pet.  They are now hungrier, thirstier, but less bored.");
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!");
                System.out.println("");
            } else if (userChoice.equals("4")) {
                tick++;
                System.out.println(" ");
                System.out.print("You've decided to adopt a furry little friend");
                System.out.println(" ");
                System.out.println("Choose the pet you would like to adopt from the list");
                String userChoice3 = input.nextLine();
                myShelter.pets.remove(userChoice3);
                System.out.println("");
                System.out.println("Congratulations! You have officially adopted " + userChoice3);
                System.out.println("");
                System.out.println(" ");
                System.out.println("You have performed " + tick + " task(s) so far!");
                System.out.println("");
            } else if (userChoice.equals("5")) {
                tick++;
                System.out.println(" ");
                System.out.print("You want to admit a creature that you found");
                System.out.println("");
                System.out.println("Please enter the name of the animal you are admitting to the PPP: ");
                String animalName = input.nextLine();
                System.out.println("Please enter the current hunger level of the animal between 1-100");
                int animalHunger = Integer.parseInt(input.nextLine());
                System.out.println("Please enter the current thirst level of the animal between 1-100");
                int animalThirst = Integer.parseInt(input.nextLine());
                System.out.println("Please enter the current boredom level of the animal between 1-100");
                int animalBoredom = Integer.parseInt(input.nextLine());
                System.out.println("Please enter a description of the pets current mood");
                String animalDescription = input.nextLine();
                System.out.println("");
                VirtualPet newVirtualPet = new VirtualPet(animalName + " \t", animalHunger, animalThirst, animalBoredom, animalDescription);
                myShelter.add(newVirtualPet);
                System.out.println("");
                System.out.println("You have performed " + tick + " task(s) so far!");
                System.out.println("");
            } else {
                System.out.println("I'm sorry, I do not understand your request");
            }
            System.out.println("Here is the status of your pets: ");
            System.out.println("");
            System.out.println("Pet Name\t|\tHunger\t|\tThirst\t|\tBoredom");
            System.out.println("___________________________________________________");
            System.out.println("");
            myShelter.showPets1();
            System.out.println("");
            System.out.println("___________________________________________________");
            System.out.println("What would you like to do?");
            System.out.println(" ");
            System.out.println("Please select from the menu below");
            System.out.println(" ");
            System.out.println("Press 1 to Feed the pets");
            System.out.println("Press 2 to Give water to the pets");
            System.out.println("Press 3 to Play with a pet");
            System.out.println("Press 4 to Adopt a pet");
            System.out.println("Press 5 to Admit a pet");
            System.out.println("Press 6 to exit");
            userChoice = input.nextLine();
        }

        System.out.println("Thanks for visiting the PPP!");
        System.exit(0);




    }


}







