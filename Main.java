package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu for Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Please enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    performOperation(scanner, '+');
                    break;
                case 2:
                    performOperation(scanner, '-');
                    break;
                case 3:
                    performOperation(scanner, '*');
                    break;
                case 4:
                    performOperation(scanner, '/');
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }

            private static void performOperation (Scanner scanner, char operator){
                System.out.println("Type your first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Type your second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("the added number is:" + result);
                        break;

                    case '-':
                        result = num1 - num2;
                        System.out.println("the subtracted number is" + result);
                        break;

                    case '*':
                        result = num1 * num2;
                        System.out.println("the multiplied number is" + result);
                        break;

                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("the divided number is" + result);
                        } else {
                            System.out.println("invalid operation : division by zero");
                            break;
                        }
                    default:
                        System.out.println("INVALID OPERATION ALERT");
                }

            }
        }


























//
//                switch (choice) {
//    case 1 :
//        System.out.println("Enter you First Number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.println("Enter your Second Number: ");
//        double num2 = scanner.nextDouble();
//
//        result  = num1 + num2;
//        System.out.println( "The added number is: " + result);
//        break;
//
//        case 2:
//            System.out.println("Enter you First Number: ");
//            num1 = scanner.nextDouble();
//
//            System.out.println("Enter your Second Number: ");
//             num2 = scanner.nextDouble();
//
//            result  = num1 - num2;
//            System.out.println( "The subtracted number is: " + result);
//            break;
//
//            case 3:
//                System.out.println("Enter you First Number: ");
//                 num1 = scanner.nextDouble();
//
//                System.out.println("Enter your Second Number: ");
//                 num2 = scanner.nextDouble();
//
//                result  = num1 * num2;
//                System.out.println( "The multiplied number is: " + result);
//                break;
//
//                case 4:
//                    System.out.println("Enter you First Number: ");
//                     num1 = scanner.nextDouble();
//
//                    System.out.println("Enter your Second Number: ");
//                     num2 = scanner.nextDouble();
//
//                    if (num2 != 0){
//                        result = num1/ num2;
//                        System.out.println("The divided number is: " +result);
//                    }
//                    else{
//                        System.out.println("error the division cannot be zero");
//                    }
//                    break;
//                default :
//                    System.out.println("Invalid Operation");
//                    break;
//                    }
//
//
//
//
//            }
//    }
//}
