public class GitTest {
    public static void main(String[] args) {
        //System.out.println("Hello world !");  // init version of App
        int a = 5, b = 9;
        System.out.println("Result of 'multiply' operation " + a + " and " + b + " is: " + mul(a, b));
        System.out.println("Operation 'add' of " + a + " and " + b + " is:" + add(a, b));
        System.out.println("Operation 'module' of " + a + " and " + b + " is:" + mod(a, b));
        System.out.println("Operation 'Max' of " + a + " and " + b + " is:" + max(a, b));
        System.out.println("Operation 'subtract' of " + a + " and " + b + " is:" + sub(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
