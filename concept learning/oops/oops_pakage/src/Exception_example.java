
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}


public class Exception_example {
    static void divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Division by zero is not allowed.");
        }
        double res = a * 1.0 / b;
        System.out.println(res);
    }

    public static void main(String[] args) {
        try {
            divide(3, 9);
        } catch (MyException e) {
            // Handle the exception, e.g., print an error message
            System.err.println("Caught MyException: " + e.getMessage());
        }
    }
}


