import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 1; i <= 10; i++) { // Заполняю пустой массив числами
            a[i - 1] = i * i;
        }
        System.out.println(Arrays.toString(a));
        for (int j = 0; j <= 8; j++) {
            for (int i = 0; i <= 8 - j; i++) { // Сортировка пузырьком
                if (a[i] < a[i + 1]) {
                    int k;
                    k = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = k;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
