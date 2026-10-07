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

        System.out.printf("Hello, %s! Your loan amount is: %f.2%n", name, loanAmount);
    }
}
