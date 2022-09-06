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
        System.out.println("8. Return to main menu");
        //Read input
        int input = sc.nextInt();

        //Switch Case
        switch (input) {
            case 1:
                System.out.println("Strings");
                outputStrings();
                break;
            case 2:
                System.out.println("String-Positionen");
                outputStringPosition();
                break;
            case 3:
                System.out.println("String-Teile-lesen");
                outputStringTeileLesen();
                break;
            case 4:
                System.out.println("String Teile bearbeiten");
                outputStringTeileBearbeiten();
                break;
            case 5:
                System.out.println("String vergleichen");
                outputStringVergleichen();
                break;
            case 6:
                System.out.println("StringBuilder");
                outputStringBuilder();
                break;
            case 7:
                System.out.println("StringUmwandlung");
                outputStringUmwandlung();
                break;
            case 8:
                System.out.println("Return to main menu");
                Main.main(null);
                break;
            default:
                System.out.println("You entered a number that is not between 1 and 8");
        }
    }

    private static void outputStringUmwandlung() {
    }

    private static void outputStringBuilder() {
        
    }

    private static void outputStringVergleichen() {
        
    }

    private static void outputStringTeileBearbeiten() {
        
    }

    private static void outputStringTeileLesen() {
        
    }

    private static void outputStringPosition() {
        
    }

    private static void outputStrings() {
        
    }

}
