import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Division Class
        Division divisionInstance = new Division();

        // get user input by creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt for input
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // call the divide method from Division class
        double resultVal = divisionInstance.divide(firstNumber, secondNumber);

        // Display result to user
        System.out.println("Divison of two numbers is: " + resultVal);

        // addtion class
        double sum = Addition.add(firstNumber, secondNumber);

        System.out.println("Sum of two numbers: " + sum);

        // close the scanner (java best practice)
        scanner.close();
    }
}
