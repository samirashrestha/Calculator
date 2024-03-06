package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Main Menu for operation:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter the operation you want to perform: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            double result = 0;


            switch (choice) {
    case 1 :
        System.out.println("Enter you First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your Second Number: ");
        double num2 = scanner.nextDouble();

        result  = num1 + num2;
        System.out.println( "The added number is: " + result);
        break;

        case 2:
            System.out.println("Enter you First Number: ");
            num1 = scanner.nextDouble();

            System.out.println("Enter your Second Number: ");
             num2 = scanner.nextDouble();

            result  = num1 - num2;
            System.out.println( "The subtracted number is: " + result);
            break;

            case 3:
                System.out.println("Enter you First Number: ");
                 num1 = scanner.nextDouble();

                System.out.println("Enter your Second Number: ");
                 num2 = scanner.nextDouble();

                result  = num1 * num2;
                System.out.println( "The multiplied number is: " + result);
                break;

                case 4:
                    System.out.println("Enter you First Number: ");
                     num1 = scanner.nextDouble();

                    System.out.println("Enter your Second Number: ");
                     num2 = scanner.nextDouble();

                    if (num2 != 0){
                        result = num1/ num2;
                        System.out.println("The divided number is: " +result);
                    }
                    else{
                        System.out.println("error the division cannot be zero");
                    }
                    break;
                default :
                    System.out.println("Invalid Operation");
                    break;
                    }




            }
    }
}
