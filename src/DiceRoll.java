import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) throws Exception 
    {

        boolean exit = false;
        String article = "a"; // initalising String

        while(!exit)
        {
            System.out.println("Which dice would you like to roll: ");
            System.out.println("D4, D6, D8, D10, D12, D20, D100");
            Scanner sc = new Scanner(System.in); // Scanner to get the users input.
            String xSidedDice = sc.nextLine(); // Assigns users input to a string.
            

            if(!"exit".equals(xSidedDice))
            {
                diceRollGenerator(xSidedDice);

                // Few lines added just for grammar purposes when returning the rolled number
                if(diceRollGenerator(xSidedDice) == 8 || diceRollGenerator(xSidedDice) == 11 || diceRollGenerator(xSidedDice) == 18 || 
                diceRollGenerator(xSidedDice) >= 80 && diceRollGenerator(xSidedDice) < 89) // 
                    article = "an: "; // If saying value aloud starts with 'E' then returns article with "an"
              else
                    article = "a: "; // Else returns article with "a"

             System.out.println("You rolled " + article +diceRollGenerator(xSidedDice)); //Result of random number selection.


            }else{
                exit = true;
            }
        }
    }


    public static int diceRollGenerator(String xSidedDice) 
    {
    
        Random ranNum = new Random();
        int randomNumber = 0; // initialising Integer
        
        switch (xSidedDice) { // Switch selection that varies random selection based on users requested dice.

            case "D4": 
            randomNumber = ranNum.nextInt(4)+1; // Returns random value of 1-4.
            break;

            case "D6":
            randomNumber = ranNum.nextInt(6)+1; // Returns random value of 1-6.
            break;

            case "D8":
            randomNumber = ranNum.nextInt(8)+1; // Returns random value of 1-8.
            break;

            case "D10":
            randomNumber = ranNum.nextInt(10)+1;// Returns random value of 1-10.
            break;

            case "D12":
            randomNumber = ranNum.nextInt(12)+1; // Returns random value of 1-12.
            break;

            case "D20":
            randomNumber = ranNum.nextInt(20)+1; // Returns random value of 1-20.
            break;

            case "D100":
            randomNumber = ranNum.nextInt(100)+1; // Returns random value of 1-100.
            break;

            default: 
            throw new IllegalArgumentException("Invalid dice selection: " +xSidedDice); // Returns exception if an input that isnt accounted for is entered.
        }
        return randomNumber;        
    }
}
