// Name: MD FARHAN TANVEER SARKER
// PRN: 23070126157
// Branch: AIML(B3)
// Batch: 23-27

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();
    

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Fibonacci");
            System.out.println("6. Sum of Array");
            System.out.println("7. Mean of Array");
            System.out.println("8. Variance of Array");
            System.out.println("9. Standard Deviation of Array");
            System.out.println("10. Exit");

            int choice = userInput.getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    int[] addNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(addNums[0], addNums[1]));
                    break;
                case 2:
                    int[] subNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(subNums[0], subNums[1]));
                    break;
                case 3:
                    int[] mulNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(mulNums[0], mulNums[1]));
                    break;
                case 4:
                    int[] divNums = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.divide(divNums[0], divNums[1]));
                    break;
                case 5:
                    int n = userInput.getIntInput("Enter Fibonacci index: ");
                    System.out.println("Fibonacci(" + n + ") = " + Arrays.toString(calculator.fibonacci(n)));
                    break;
                case 6:
                    int[] arrSum = userInput.getArrayInput();
                    System.out.println("Sum of Array: " + calculator.sumOfArray(arrSum));
                    break;
                case 7:
                    int[] arrMean = userInput.getArrayInput();
                    System.out.println("Mean of Array: " + calculator.meanOfArray(arrMean));
                    break;
                case 8:
                    int[] arrVar = userInput.getArrayInput();
                    System.out.println("Variance of Array: " + calculator.varianceOfArray(arrVar));
                    break;
                case 9:
                    int[] arrSD = userInput.getArrayInput();
                    System.out.println("Standard Deviation of Array: " + calculator.standardDeviationOfArray(arrSD));
                    break;
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
