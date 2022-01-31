public class Task2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            if (i % 9 == 0) {
                continue;
            } else if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}