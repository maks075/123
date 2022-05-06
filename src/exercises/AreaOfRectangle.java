package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of a rectangle please: ");
        Double length = input.nextDouble();
        //System.out.println(length);
        System.out.println("Enter a width of a rectangle: ");
        Double width = input.nextDouble();
        System.out.println("The area of a rectangle equals " + width*length );
    }
}
