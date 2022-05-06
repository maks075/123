package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven: ");
        Double distance = input.nextDouble();
        System.out.println("Please enter the amount of gas you've consumed(in gallons): ");
        Double gasAmount = input.nextDouble();
        System.out.println("Your gas consumption is " + distance/gasAmount + " miles per gallon");
    }
}
