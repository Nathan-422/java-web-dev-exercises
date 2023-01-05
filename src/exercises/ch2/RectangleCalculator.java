package exercises;

import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This is a line");

        System.out.println("What is the length of the rectangle?");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the height of the rectangle?");
        int height = Integer.parseInt(input.nextLine());

        System.out.println("Area of the rectangle is: " + length * height);
    }


}
