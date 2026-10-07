package org.example.assessment;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
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
