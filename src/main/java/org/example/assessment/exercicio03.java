package org.example.assessment;

/*
Crie um programa que:

Peça ao usuário seu nome e seu salário mensal.
Aplique a seguinte tabela:
Até R$ 22.847,76 → Isento
De R$ 22.847,77 a R$ 33.919,80 → 7,5%
De R$ 33.919,81 a R$ 45.012,60 → 15%
Acima de R$ 45.012,61 → 27,5%
O programa deve calcular e exibir o valor do imposto e o salário líquido.
 */

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("name:");
        String name = sc.nextLine();

        System.out.println("Annual salary");
        double annualSalary = sc.nextDouble();

        greeting(name);
        taxTable(annualSalary);

        sc.close();
    }

    public static void taxTable(double salary) {

        if (salary <= 22847.76) {
            System.out.printf("%nTax-exempt. Salary: $%.2f%n", salary);
        } else if (salary >= 22847.77 && salary <= 33919.80) {
            calculator(salary, 0.075);
        } else if (salary >= 33919.81 && salary <= 45012.60) {
            calculator(salary, 0.15);
        } else if (salary >= 45012.61) {
            calculator(salary, 0.275);
        }
    }

    public static void calculator(double salary, double tax) {
        double adjustedAmount = salary * tax;
        double finalSalary = salary - adjustedAmount;
        System.out.printf("%nTax: $%.2f | Salary: $%.2f%n", adjustedAmount, finalSalary);
    }

    public static void greeting(String name) {
        System.out.printf("Hello, %s! Welcome to the system.", name);
    }
}
