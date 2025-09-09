import java.util.Scanner;

public class WaterIntakeCalc
//Sebastian Tapia
//WaterIntake Calculator
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in); //Scanner

        int convML = 237;
        int convOZ = 8;
        int userIntake;

        System.out.print("Enter the number of water glasses: ");
        userIntake = sc.nextInt(); //Prompt

        System.out.println("Your water intake was: " + (userIntake * convOZ) 
                           + " ounces or " + (userIntake * convML) + " milliliters.");


        sc.close();

    }
}