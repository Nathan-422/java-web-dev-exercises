package exercises.ch2;

import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have were driven?");
        double miles = Double.parseDouble(input.nextLine());

        System.out.println("How many gallons of gas were consumed?");
        double gallons = Double.parseDouble(input.nextLine());

        float MPGtoOneDec = Math.round((miles / gallons) * 10.0f) / 10.0f;

        System.out.println("Your MPG was: " + MPGtoOneDec);
    }
}
