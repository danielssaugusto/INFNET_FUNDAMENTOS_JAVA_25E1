package org.example.assessment;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        boolean validPassword = false;

        while (!validPassword) {
            System.out.println("Password");
            String password = sc.nextLine();

            validPassword = passwordValidation(name, password);
        }

        sc.close();
    }

    public static boolean passwordValidation(String name, String password) {

        if (password.length() < 8) {
            System.out.println("Your password must have at least 8 characters.");
            return false;
        }

        if (!isUpperCase(password)) {
            System.out.println("Your password must contain at least one uppercase letter.");
            return false;
        }

        if (!isNumber(password)) {
            System.out.println("Your password must contain at least one number.");
            return false;
        }

        if (!isSpecialChar(password)) {
            System.out.println("Your password must contain at least one special character.");
            return false;
        }

        System.out.println("Password registered successfully!");
        System.out.println("Welcome, " + name);

        return true;
    }

    public static boolean isUpperCase(String password) {
        for (char charactere : password.toCharArray()) {
            if (Character.isUpperCase(charactere)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String password) {
        for (char charactere : password.toCharArray()) {
            if (Character.isDigit(charactere)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialChar(String password) {
        for (char charactere : password.toCharArray()) {
            if (!Character.isLetterOrDigit(charactere)) {
                return true;
            }
        }
        return false;
    }
}
