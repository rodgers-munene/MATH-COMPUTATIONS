import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        double firstNumber, secondNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("\nOperations: ");
        System.out.println("1: Addition");
        System.out.println("2: Division");
        System.out.println("3: Area of a Triange");
        System.out.println("4: Perimeter of a rectangle");
        System.out.println("5: Area of Circle");
        System.out.println("6: Multiplication");
        System.out.print("\nPlease Select the operation you would like to perfom: ");
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
                TriangleArea area = new TriangleArea();
                System.out.println("Result = " + area.area(firstNumber, secondNumber));
                break;
            case 4:
                System.out.print("Enter the length of the rextangle:");
                firstNumber = in.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                secondNumber = in.nextDouble();
                RectanglePerimeter perimeter = new RectanglePerimeter();
                System.out.println("Result = " + perimeter.perimeter(firstNumber, secondNumber));
                break;
            case 5:
                System.out.print("Enter the radius of the circle: ");
                firstNumber = in.nextDouble();
                CircleArea circle = new CircleArea();
                System.out.println("Result = " + circle.area(firstNumber));
                break; 
            case 6:
                System.out.print("Enter the first number: "); 
                firstNumber = in.nextDouble();
                System.out.print("Enter the second number: ");
                secondNumber = in.nextDouble();
                Multiplication multiple = new Multiplication();  
                System.out.println("Result = " + multiple.multiply(firstNumber, secondNumber)); 
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    in.close();
    }
}
