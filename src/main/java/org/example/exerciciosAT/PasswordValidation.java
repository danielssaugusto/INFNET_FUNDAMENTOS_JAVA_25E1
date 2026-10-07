package org.example.exerciciosAT;

/*
Crie um programa que:

Solicite ao usuário seu nome e uma senha.
A senha deve:
Ter no mínimo 8 caracteres.
Conter pelo menos uma letra maiúscula, um número e um caractere especial (@, #, $, etc.).
Caso a senha seja inválida, o programa deve informar o erro específico e solicitar uma nova tentativa.
*/


import java.util.Scanner;

public class PasswordValidation {
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

    // Validação da senha
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

    // Verificar se há pelo menos uma letra maiúscula
    public static boolean isUpperCase(String password) {
        for (char charactere : password.toCharArray()) {
            if (Character.isUpperCase(charactere)) {
                return true;
            }
        }
        return false;
    }

    // Verificar se há um número
    public static boolean isNumber(String password) {
        for (char charactere : password.toCharArray()) {
            if (Character.isDigit(charactere)) {
                return true;
            }
        }
        return false;
    }

    // Verificar se há um caractere especial
    public static boolean isSpecialChar(String password) {
        for (char charactere : password.toCharArray()) {
            if (!Character.isLetterOrDigit(charactere)) {
                return true;
            }
        }
        return false;
    }
}
