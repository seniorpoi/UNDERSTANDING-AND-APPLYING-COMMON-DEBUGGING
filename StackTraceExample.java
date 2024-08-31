public class StackTraceExample {

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int result = 10 / 0; // This will cause an ArithmeticException (divide by zero)
    }
}
