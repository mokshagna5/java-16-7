package conditional_statements;

public class test {
    public static void main(String[] args) {
        // using else-if ladder
        // 0 to 4 ->toddler
        // 5 to 12 ->child
        // 13 to 19 ->Teenager
        // 20 to 26 ->Young Adult
        // 27 Above ->Adult

        int age = 10;
        if (age <= 4) {
            System.out.println("Toddler");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenage");
        } else if (age >= 20 && age <= 26) {
            System.out.println("Young Adult");
        } else {
            System.out.println("Adult");
        }

        // using switch case--->fall through
        String category;
        switch (age) {
            case 0:
            case 2:
            case 3:
            case 4:
                System.out.println("Toddler");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Child");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:

                System.out.println("Teenager");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("Young-Adult");
                break;

            default:
                System.out.println("Adult");
            break;
        }

    }

}
