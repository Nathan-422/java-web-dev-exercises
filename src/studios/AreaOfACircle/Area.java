/*
Authors: Alena, Gabbie, Nathan
Class: lc_101
Section: September 2022
Instruction: Carrie Jones
 */

package studios.AreaOfACircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double r = 1.0;

        while (true) {

            System.out.println("Give a radius: ");
            String userInput = input.nextLine();

            if (userInput.equals("")) {
                System.out.println("Input must not be empty");
                continue;
            }

            // try catch
            try {
                r = Double.parseDouble(userInput);
            } catch (Exception e) {
                System.out.println("Input must be a number.");
                continue;
            }

            if (r <= 0.0) {
                System.out.println("Input must be positive.");
                continue;
            }

            break;

        }

        double area = Circle.getArea(r);

        System.out.println("The area of a circle of radius " + r + " is: " + Math.round(area * 1000) / 1000f);
    }

}
