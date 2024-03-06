// Name - Akshat D Jain
// PRN - 22070126136
// Batch - AIML B3
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();
        double[] numbers;
        double firstNumber = 0, secondNumber = 0;

        try {
            numbers = input.inputNumbers();
            firstNumber = numbers[0];
            secondNumber = numbers[1];
        } catch (InputMismatchException e) {
            System.out.println("Error: InputMismatchException - Please enter valid numbers.");
            return;
        }

        System.out.println("Enter Operation");
        System.out.println("+ for Addition Operation");
        System.out.println("- for Subtraction Operation");
        System.out.println("* for Multiplication Operation");
        System.out.println("/ for Division Operation");
        System.out.println("A for Array Operation");

        Scanner scn = new Scanner(System.in);
        char operator;

        try {
            operator = scn.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Error: InputMismatchException - Please enter a valid operation character.");
            return;
        }

        try {
            switch (operator) {
                case '+':
                    System.out.println("The Addition of " + firstNumber + " and " +
                            secondNumber + " is " + calculator.addition(firstNumber, secondNumber));
                    break;
                case '-':
                    System.out.println("The Subtraction of " + firstNumber + " and " +
                            secondNumber + " is " + calculator.subtraction(firstNumber, secondNumber));
                    break;
                case '*':
                    System.out.println("The Multiplication of " + firstNumber + " and " +
                            secondNumber + " is " + calculator.multiplication(firstNumber, secondNumber));
                    break;
                case '/':
                    System.out.println("The Division of " + firstNumber + " and " + secondNumber
                            + " is " + calculator.division(firstNumber, secondNumber));
                    break;
                case 'A':
                    double[] arr = input.getArrayInput();
                    System.out.println("var for variance Operation");
                    System.out.println("std for Standard Deviation Operation");
                    System.out.println("avg for Average Operation");
                    String arrayOperation = scn.next();
                    try {
                        switch (arrayOperation) {
                            case "var":
                                System.out.println("Variance: " + calculator.varianceOfArray(arr));
                                break;
                            case "std":
                                System.out.println("Standard Deviation: " + calculator.standardDeviationOfArray(arr));
                                break;
                            case "avg":
                                System.out.println("Average: " + calculator.calculateMean(arr));
                                break;
                            default:
                                System.out.println("Invalid array operation");
                                break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: ArrayIndexOutOfBoundsException - Invalid array operation.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: NumberFormatException - " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: IllegalStateException - " + e.getMessage());
        } finally {
            scn.close(); // Close the scanner when you are done using it.
        }
    }
}
