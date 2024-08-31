public class Breakpoint {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = add(x, y);
        System.out.println("Result: " + result);

        int z = multiply(result, 5);
        System.out.println("Final Result: " + z);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
