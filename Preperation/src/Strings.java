import java.util.Scanner;

public class Strings {
    public static void menu() {
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("1. Strings");
        System.out.println("2. String-Positionen");
        System.out.println("3. String-Teile-lesen");
        System.out.println("4. String-Teile-bearbeiten");
        System.out.println("5. String-vergleichen");
        System.out.println("6. StringBuilder");
        System.out.println("7. StringUmwandlung");
        System.out.println("12. Return to main menu");
        //Read input
        int input = sc.nextInt();

        //Switch Case
        switch (input) {
            case 1:
                System.out.println("ArrayList");
                outputArrayList();
                break;
            case 2:
                System.out.println("LinkedList");
                outputLinkedList();
                break;
            case 3:
                System.out.println("Queue");
                outputQueue();
                break;
            case 4:
                System.out.println("Stack");
                outputStack();
                break;
            case 5:
                System.out.println("HashSet");
                outputHashSet();
                break;
            case 6:
                System.out.println("LinkedHashSet");
                outputLinkedHashSet();
                break;
            case 7:
                System.out.println("HashMap");
                outputHashMap();
                break;
            case 8:
                System.out.println("LinkedHashMap");
                outputLinkedHashMap();
                break;
            case 9:
                System.out.println("HashInformationen");
                HashInformationen();
                break;
            case 10:
                System.out.println("Datentypen");
                Datentypen();
                break;
            case 11:
                System.out.println("WeitereMethoden");
                WeitereMethoden();
                break;
            case 12:
                System.out.println("Hilfsklasse");
                Hilfsklasse();
                break;
            case 13:
                System.out.println("Return to main menu");
                Main.main(null);
                break;
            default:
                System.out.println("You entered a number that is not between 1 and 9");
        }
    }

}
