package org.example.exerciciosAT;

// Solicite ao usuário seu nome e uma senha.
// A senha deve:
// Ter no mínimo 8 caracteres.
// Conter pelo menos uma letra maiúscula, um número e um caractere especial (@, #, $, etc.).
// Caso a senha seja inválida, o programa deve informar o erro específico e solicitar uma nova tentativa.

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String password = sc.nextLine();

        successLogin(password, name);
    }

    public static void successLogin(String password, String name) {
        if (validationPassword(password)) {
            System.out.println("Welcome, " + name);
        }
    }

    public static boolean validationPassword(String password) {
        boolean validPassword = true;

        if (password.length() < 8) {
            System.out.println("Sua senha deve ter pelo menos 8 caracteres.");
            validPassword = false;

        }

        if (!isMaiuscula(password)) {
            System.out.println("Sua senha precisa ter uma letra maiuscula.");
            validPassword = false;
        }

        if (!isNumber(password)) {
            System.out.println("Sua senha deve conter um número.");
            validPassword = false;
        }

        if (!isSpecialChar(password)) {
            System.out.println("Sua senha deve conter um caractere especial.");
            validPassword = false;
        }

        if (validPassword) {
            System.out.println("Senha válida!");
        }
        return validPassword;
    }

    public static boolean isMaiuscula(String password) {
        for (char caractere : password.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String password) {
        for (char caractere : password.toCharArray()) {
            if (Character.isDigit(caractere)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialChar(String password) {
        for (char caractere : password.toCharArray()) {
            if (!Character.isLetterOrDigit(caractere)) {
                return true;
            }
        }
        return false;
    }


}
