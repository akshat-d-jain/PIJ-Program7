import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
  public double[] inputNumbers() throws InputMismatchException {
    double numbers[] = new double[2];
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter First Number:");
    double firstNumber = scan.nextDouble();
    numbers[0] = firstNumber;
    System.out.println("Enter Second Number :");
    double secondNumber = scan.nextDouble();
    numbers[1] = secondNumber;
    return numbers;
  }

  public double[] getArrayInput() throws InputMismatchException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scanner.nextInt();
    double[] array = new double[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextDouble();
    }
    return array;
  }
}
