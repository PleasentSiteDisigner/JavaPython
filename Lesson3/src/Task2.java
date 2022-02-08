public class Task2 {
    public static void main(String[] args) {
        int a = 8, x = 2, y = 10;
        int factorial = getFactorial(a);
        int powerX = power(x ,y);
        System.out.println(factorial);
        System.out.println(powerX);
    }

    public static int getFactorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * getFactorial(x - 1);
        }
    }
    public static int power(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * power(x, y - 1);
        }
    }
}
