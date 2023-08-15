package com.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = -1;
        boolean validAge = false;

        while (!validAge) {
            try {
                System.out.print("Enter your age: ");
                String ageInput = scanner.nextLine();

                if (StringUtils.isNumeric(ageInput)) {
                    age = Integer.parseInt(ageInput);
                    if (age < 0) {
                        System.out.println("Age cannot be negative. Please enter a valid age.");
                    } else {
                        validAge = true;
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number for age.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
        }

        if (age >= 18) {
            System.out.println(name + ", you are allowed to vote.");
        } else {
            System.out.println(name + ", you are not allowed to vote.");
        }

        scanner.close();
    }
}

