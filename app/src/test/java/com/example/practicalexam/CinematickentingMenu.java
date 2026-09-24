package com.example.practicalexam;

import java.util.Scanner;

public class CinematicketingMenu {
    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("---Cinematic Ticketing System---");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("--------------------- ");
                    System.out.print("Choose buy ticket");
                    int age = scanner.nextInt();
                    if (age < 18) {
                        System.out.println("Access Denied");
                    } else {
                        System.out.println("Ticket Printed");
                    }
                    break;
                case 2:
                    System.out.println("-------------------- ");
                    System.out.println("choose buy snacks");
                    break;
                case 3:
                    System.out.println("-------------------- ");
                    System.out.println("choose exit");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
