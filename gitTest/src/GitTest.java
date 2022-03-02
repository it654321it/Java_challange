public class GitTest {
    public static void main(String[] args) {
        //System.out.println("Hello world !");  // init version of App
        int a = 10, b = 3;
        System.out.println("Operation 'multiply' of " + a + " and " + b + " is:" + mul(a, b));
        System.out.println("Operation 'add' of " + a + " and " + b + " is:" + add(a, b));
        System.out.println("Operation 'substruct' of " + a + " and " + b + " is:" + sub(a, b));
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
}
