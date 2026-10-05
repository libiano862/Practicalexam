package com.example.practicalexam;

import com.example.practicalexam.CinematicketingMenu;

import java.util.Scanner;

public class ConsoleLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new CinematicketingMenu().start(scanner);
        scanner.close();
    }
}