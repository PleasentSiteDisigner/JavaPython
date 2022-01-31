public class FirstHomeWork {

    public static void main(String[] args) {

        int x = 12;

        // Variant 1

        if (x == 12 || x > 0 && x <= 2) {
            System.out.println("Winter");
        } else if (x >= 3 && x <= 5) {
            System.out.println("Spring");
        } else if (x >= 6 && x <= 8) {
            System.out.println("Summer");
        } else if (x >= 9 && x <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrect x");
        }

        // Variant 2

        switch (x) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect x");
        }
    }
}
