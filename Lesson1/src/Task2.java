public class Task2 {
    public static void main(String[] args) {
        double D, a, b, c;
        a = 3;
        b = 7;
        c = -10;
        D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Нет решения");
        } else if (D == 0) {
            System.out.println("X = " + (-b / (2 * a)));
        } else {
            System.out.println("X(1) = " + ((-b + Math.sqrt(D)) / (2 * a)));
            System.out.println("X(2) = " + ((-b - Math.sqrt(D)) / (2 * a)));
        }
    }
}
