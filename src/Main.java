
import java.util.Random;
import java.util.Scanner;

public class Main {


    /*
            This is the main program.
     */

    public static void main(String[] args) {

        System.out.println("Welcome to the Grand Circus Casino!\n");                                                    //welcome message

            while (userContinueProgram()) {

            int sides = userInput();
            int dice1 = getDiceRoll(sides);
            int dice2 = getDiceRoll(sides);

            System.out.println("Dice roll 1: " + dice1 + "\n" + "Dice roll 2: " + dice2 + "\n");

            if (dice1 + dice2 == 2) {
                System.out.println("Snake eyes!\n");
            } else if (dice1 + dice2 == 7) {
                System.out.println("Craps!\n");
            } else if (dice1 == 6 && dice2 == 6) {
                System.out.println("Boxcars!\n");
            }

        }

    }

    /*
            This is the method to obtain user input on number of sides the dice have.
     */

    public static int userInput ()
    {
        Scanner diceSide = new Scanner(System.in);
        int numSides = 0;


        System.out.println("How many sides should each die have? ");
        numSides = diceSide.nextInt();
        diceSide.nextLine();

            if (numSides < 4) {
                System.out.println("Minimum sides for a die is 4. Please enter number higher then 4.");
                numSides = diceSide.nextInt();
                diceSide.nextLine();
            }

        return numSides;
    }


    /*
            This is the method for generating the random dice roll.
     */

    public static int getDiceRoll (int diceSide)
    {
        Random randGen = new Random ();

        int diceRoll = 0;

        diceRoll = randGen.nextInt(diceSide)+1;

        return diceRoll;
    }


    /*
            This is the method for user input to start the game.
     */

    public static boolean userContinueProgram ()
    {
        Scanner scan = new Scanner(System.in);
        String userCont;

        System.out.println("Would you like to play? (y/n)");
        userCont = scan.nextLine();

        while ( !userCont.equalsIgnoreCase("y") &&
                !userCont.equalsIgnoreCase("yes") &&
                !userCont.equalsIgnoreCase("n") &&
                !userCont.equalsIgnoreCase("no"))
        {
            System.out.println("That is not a valid input.  Please try again. (y/n) ");
            userCont = scan.nextLine();
        }


        if (userCont.equals("y") || userCont.equals("yes")) {
            System.out.println("Lets play!\n");
            return true;
        } else {
            System.out.println("Thanks You. Goodbye.");
            return false;
            //System.exit(0);                                                                                             // Exits the program if user enters anything other then 'y'
        }


    }



}





