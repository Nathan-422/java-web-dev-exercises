package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {

    public static void main(String[] args) {

        // init variables

        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // take user input to populate hashmap

        System.out.println("Enter your students' name and ID:");

        while (true) {

            // collect student or exit
            System.out.print("Student (Enter nothing to finish): ");
            String studentInput = scanner.nextLine();

            // exit statement - finished entering students
            if (studentInput.equals("") || studentInput.toLowerCase().equals("nothing")) {
                break;
            }

            // get ID
            Integer idInput = null;
            System.out.print("ID number: ");

            // loop if input is not an int
            while (!scanner.hasNextInt()) {
                scanner.nextLine(); // eat the current buffered input
                System.out.print("Woops. Try again.\nID number: ");
            }

            // save the int
            idInput = scanner.nextInt();
            scanner.nextLine(); // clear the system.in buffer

            // save student in HashMap
            students.put(idInput, studentInput);

        }

        // settings for roster formatting
        int padding = 16;

        // output the roster
        System.out.println("name" + "        " + "id number");
        System.out.println("---------------------");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            StringBuilder line = new StringBuilder();

            line.append(student.getValue());
            for (int i = 0; i < padding - student.getValue().length(); i++) {
                line.append(" ");
            }
            line.append(student.getKey());

            System.out.println(line);
        }

        // print class roster

    }

}
