public class Division {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Handle division by zero
        }
        return dividend / divisor;
    }
}
