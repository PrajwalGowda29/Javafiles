class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionDemo {

    // Method to perform division
    static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            // Throwing custom exception
            throw new DivisionByZeroException("Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            // Calling divide method
            divide(num1, num2);

        } catch (DivisionByZeroException e) {
            // Catching custom exception
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            // Finally block always executes
            System.out.println("Execution completed.");
        }
    }
}
