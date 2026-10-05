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
                    System.out.println("--------------------- ");
                    System.out.println("Choose movie ticket to buy");
                    System.out.println("1. bugboy: theres a way home");
                    System.out.println("2. bugboy: old night");
                    System.out.println("3. bugboy: going out the bug-verse");
                    System.out.println("4. Oppenheimer");
                    System.out.print("Enter your choice: ");

                    int movieChoice = scanner.nextInt();

                    switch (movieChoice) {
                        case 1:
                            System.out.println("Movie purchased");
                            break;
                        case 2:
                            System.out.println("Movie purchased");
                            break;
                        case 3:
                            System.out.println("Movie purchased");
                            break;
                        case 4:
                            System.out.println("How old are you?");
                            int age = scanner.nextInt();
                            if (age >= 18) {
                                System.out.println("Movie purchased");
                            } else {
                                System.out.println("you are not old enough to buy this movie");
                            }
                            break;
                        default:
                            System.out.println("Invalid movie choice.");
                            break;
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