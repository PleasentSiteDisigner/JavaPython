public class Example {
    public static void main(String[] args) {
        wingFactory(10, 5);
        engineFacroty();
    }

    public static void wingFactory( int a, int b) {
        int result = a + b;
        System.out.println(a + " wings and " + b + " wings done " + result);
    }

    public static void engineFacroty() {
        System.out.println("Solyara zalita");
    }
}
