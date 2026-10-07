package org.example.assessment;

/*
Solicitar nome do cliente e valor do empréstimo.
Solicitar quantidade de parcelas (mínimo 6, máximo 48).
Aplicar taxa de juros mensal fixa de 3%.
Exibir o valor total a ser pago e o valor das parcelas mensais.
 */

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        initialMenu();
    }

    public static void initialMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Loan amount:");
        double loanAmount = sc.nextDouble();

        byte installments;
        do {
            System.out.println("How many installments?");
            installments = sc.nextByte();
        } while (installments < 6 || installments > 48);

        calculator(name, loanAmount, installments);
    }

    public static void calculator(String name, double loanAmount, byte installments) {
        double MONTHLY_INTEREST_RATE = 0.03;

        double amountPerMonth = loanAmount / installments;
        double interestAmount = amountPerMonth * MONTHLY_INTEREST_RATE;
        double totalAmountWithInterest = amountPerMonth + interestAmount;
        double finalTotalAmount = totalAmountWithInterest * installments;

        System.out.printf("""
                   Hello, %s!%n
                   Loan amount: %.2f%n
                   Installments: %d%n
                   Interest amount per month: %.2f%n
                   Final total amount: %.2f%n
                   """, name, loanAmount, installments, interestAmount, finalTotalAmount);
    }
}
