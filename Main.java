import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double firstNumber, secondNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("\nOperations: ");
        System.out.println("1: Addition");
        System.out.println("2: Division");
        System.out.println("3: Area of a Triange");
        System.out.print("\nPlease Select the operation you would like to perfom: \n");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the first number: ");
                firstNumber = in.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber = in.nextDouble();
                Addition add = new Addition();
                System.out.println("Result = " + add.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.print("Enter the first number: ");
                firstNumber = in.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber = in.nextDouble();
                Division divide = new Division();
                System.out.println("Result = " + divide.divide(firstNumber, secondNumber));
                break;
            case 3:
                System.out.print("Enter the Base of the triangle: ");
                firstNumber = in.nextDouble();
                System.out.print("Enter the Height of the triangle: ");
                secondNumber = in.nextDouble();
                TriangleArea triange = new TriangleArea();
                System.out.println("Result = " + triange.area(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    }
}
