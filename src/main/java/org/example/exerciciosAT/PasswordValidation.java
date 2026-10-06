package org.example.exerciciosAT;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String name = sc.nextLine();

        boolean passwordValid = false;

        while (!passwordValid) {
            System.out.println("Insert your password:");
            String password = sc.nextLine();
            successLogin(password, name);
        }

        System.out.println("Password registered successfully!");
        System.out.println("User: " + name);

        sc.close();
    }

    public static void successLogin(String password, String name) {
        if (passwordValidation(password)) {
            System.out.println("Welcome, " + name);
        }
    }

    public static boolean passwordValidation(String password) {
        boolean validPassword = true;

        if (password.length() < 8) {
            System.out.println("Your password must be at least 8 characters long.");
            validPassword = false;

        }

        if (!isMaiuscula(password)) {
            System.out.println("Your password must contain at least one uppercase letter.");
            validPassword = false;
        }

        if (!isNumber(password)) {
            System.out.println("Your password must contain at least one number.");
            validPassword = false;
        }

        if (!isSpecialChar(password)) {
            System.out.println("Your password must contain at least one special character.");
            validPassword = false;
        }

        if (validPassword) {
            System.out.println("Valid password!");
        }
        return validPassword;
    }

    public static boolean isMaiuscula(String password) {
        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String password) {
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialChar(String password) {
        for (char character : password.toCharArray()) {
            if (!Character.isLetterOrDigit(character)) {
                return true;
            }
        }
        return false;
    }


}
