import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Switch Case Repetition
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("01. IDE");
        System.out.println("02. Algorithmen");
        System.out.println("03. OO-Konzepte");
        System.out.println("04. Klassen und Objekte mit Variablen");
        System.out.println("05. Klassen und Objekte mit Methoden");
        System.out.println("06. Sichtbarkeit");
        System.out.println("07. Konstruktoren");
        System.out.println("08. Statische Variablen und Methoden");
        System.out.println("09. Datentypen");
        System.out.println("10. Strings");
        System.out.println("11. Vertiefung");
        System.out.println("12. Beziehungen");
        System.out.println("13. Lineare Datenstruktur");
        //System.out.println("09. Repetition 2 Teil");
        //System.out.println("06. Repetition 1 Teil");
        //System.out.println("12. Repetition 3 Teil");
        //System.out.println("16. Repetition 4 Teil");
        System.out.println("Enter a number between 1 and 13");
        //Read input
        int input = sc.nextInt();


        //Switch Case
        switch (input) {
            case 1:
                System.out.println("IDE");
                break;
            case 2:
                System.out.println("Algorithmen");
                break;
            case 3:
                System.out.println("OO-Konzepte");
                break;
            case 4:
                System.out.println("Klassen und Objekte mit Variablen");
                break;
            case 5:
                System.out.println("Klassen und Objekte mit Methoden");
                break;
            /*case 14:
                System.out.println("Repetition 1 Teil");
                break;*/
            case 6:
                System.out.println("Sichtbarkeit");
                Sichtbarkeit.menu();
                break;
            case 7:
                System.out.println("Konstruktoren");
               //Konstruktoren.menu();
                break;
            /*case 15:
                System.out.println("Repetition 2 Teil");
                break;*/
            case 8:
                System.out.println("Statische Variablen und Methoden");
                break;
            case 9:
                System.out.println("Datentypen");
                //Datentypen.menu();
                break;
            /*case 16:
                System.out.println("Repetition 3 Teil");
                break;*/
            case 10:
                System.out.println("Strings");
                Strings.menu();
                break;
            case 11:
                System.out.println("Vertiefung");
                break;
            case 12:
                System.out.println("Beziehungen");
                break;
            /*case 17:
                System.out.println("Repetition 4 Teil");
                break;*/
            case 13:
                System.out.println("Lineare Datenstruktur");
                LineareDatenstrukturen.menu();
                break;
            case 18:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("You entered a number that is not between 1 and 13");
        }
    }
}
