package com.main.calculate;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        int a,b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        int choice;


        while (true) {
            System.out.println("Select an option");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");


            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Sum: " +(a+b));
                    break;
                case 2:
                    System.out.println("Subtract: "+(a-b));
                    break;
                case 3:
                    System.out.println("Product: "+(a*b));
                    break;
                case 4:
                    System.out.println("Division: "+(a/b));
                    break;
                case 5:
                    System.exit(0);


            }
        }
    }
}
