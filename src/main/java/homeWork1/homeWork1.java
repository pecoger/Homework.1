package homeWork1;

import java.util.Scanner;

public class homeWork1 {

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("Please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your age");
        int userAge = Integer.parseInt(scanner.nextLine());

        System.out.println("Please tell us about your hobbies");
        String hobbies = scanner.nextLine();

        System.out.println("You are " + firstName + " " + lastName + " and your age is " + userAge +
                "." + "\nYour hobbies are: " + hobbies);


    }
}
