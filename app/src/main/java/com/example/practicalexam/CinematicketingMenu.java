package com.example.practicalexam;

import java.util.Scanner;

public class CinematicketingMenu {

    public void start(Scanner scanner) {
        while (scanner.hasNextInt()) {
            System.out.println("\n--- Cinema Ticketing System ---");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Exiting system. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter your age: ");
                    if (scanner.hasNextInt()) {
                        int age = scanner.nextInt();
                        if (age < 18) {
                            System.out.println("Access Denied: You must be at least 18 years old.");
                        } else {
                            System.out.println("Ticket Printed: Enjoy the movie!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Snack Purchased: Enjoy your snacks!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
