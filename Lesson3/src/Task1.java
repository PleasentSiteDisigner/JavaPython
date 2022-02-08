public class Task1 {
    public static void main(String[] args) {
        double D, a, b, c;
        a = 1;
        b = -2;
        c = -24;
        D = getD(a, b, c);
        if (D < 0) {
            System.out.println("Нет решения");
        } else if (D == 0) {
            System.out.println("X = " + getX1(a, b));
        } else {
            double[] decisions = getX2(D, a, b);
            System.out.println("X(1) = " + decisions[0]);
            System.out.println("X(2) = " + decisions[1]);
        }
    }

    public static double getD(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

     public static double getX1(double a, double b) {
         return -b / (2 * a);
     }

    public static double[] getX2(double D,double a, double b) {
        double[] x2 = {(-b + Math.sqrt(D)) / (2 * a), (-b - Math.sqrt(D)) / (2 * a)};
        return x2;
    }
}
