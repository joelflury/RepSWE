import java.util.Scanner;

public class Sichtbarkeit {

    public static void menu() {
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("1. Erklärung Parameter und Rückgabewert");
        System.out.println("2. Mehoden Deklaration");
        System.out.println("3. Mehoden Aufruf");
        System.out.println("4. Erklärung Sichtbarkeit");
        System.out.println("5. Zugriff auf Objekte");
        System.out.println("6. Verwendung von This");
        System.out.println("7. toString");
        System.out.println("8. Return to main menu");
        //Read input
        int input = sc.nextInt();

        //Switch Case
        switch (input) {
            case 1:
                System.out.println("Erklärung Parameter und Rückgabewert");
                outputParameter();
                break;
            case 2:
                System.out.println("Mehoden Deklaration");
                outputMethodenDeklaration();
                break;
            case 3:
                System.out.println("Mehoden Aufruf");
                outputMethodenAufruf();
                break;
            case 4:
                System.out.println("Erklärung Sichtbarkeit");
                outputSichtbarkeit();
                break;
            case 5:
                System.out.println("Zugriff auf Objekte");
                outputZugriffAufObjekte();
                break;
            case 6:
                System.out.println("Verwendung von This");
                outputVerwendungVonThis();
                break;
            case 7:
                System.out.println("toString");
                outputToString();
                break;
            case 8:
                System.out.println("Return to main menu");
                Main.main(null);
                break;
            default:
                System.out.println("You entered a number that is not between 1 and 8");
                break;
        }
    }

    private static void outputToString() {
        System.out.println("toString");
        System.out.println("toString ist eine Methode, die Membervariablen eines Objektes in einen String umwandelt.");
        System.out.println("Es kann als Debugging-Tool verwendet werden, um den Inhalt eines Objektes zu überprüfen.");
        System.out.println("Innerhalb System.out.println() wird automatisch toString() aufgerufen.");
        //Objekt als String ausgeben
        System.out.println("Objekt als String ausgeben");
        System.out.println("House house = new House();");
        System.out.println("house.setHeigth(10);");
        System.out.println("house.setColor(red);");
        System.out.println("system.out.println(house)");
        System.out.println("public String toString() {");
        System.out.println("return Hoehe: + height + Farbe: + color;");
        System.out.println("}");
        System.out.println("Ausgabe:  + Hoehe:  + 10 +  Farbe:  + rot");

    }

    private static void outputVerwendungVonThis() {
        System.out.println("Verwendung von This");
        System.out.println("Mit dem Schlüsselwort this kann auf die Membervariable zugegriffen werden.");
        System.out.println("Ohne this wird auf die Übergabenparameter oder lokale Varibaeln zugegriffen.");

        //Membervaliable schreiben
        System.out.println("public void setHeight(int height) {");
        System.out.println("if (height > 0) {");
        System.out.println("this.height = height;");
        System.out.println("}");
    }

    private static void outputZugriffAufObjekte() {
        System.out.println("Zugriff auf Objekte");
        System.out.println("Member Variablen sind grundsätzlich private");
        System.out.println("Get Methoden sind zum lesen der Member Variablen");
        System.out.println("Set Methoden sind zum schreiben der Member Variablen");

    }

    private static void outputSichtbarkeit() {
        System.out.println("Sichtbarkeit");
        System.out.println("Sichtbarkeit bezieht sich auf die Sichtbarkeit von Variablen und Methoden.");
        System.out.println("Es gibt 4 Sichtbarkeiten:");
        System.out.println("public: Die Variable oder Methode ist für alle Klassen sichtbar.");
        System.out.println("private: Die Variable oder Methode ist nur innerhalb der Klasse sichtbar.");
        System.out.println("protected: Die Variable oder Methode ist nur innerhalb der Klasse und in abgeleiteten Klassen sichtbar.");
        System.out.println("default: Die Variable oder Methode ist nur innerhalb des Pakets sichtbar.");

        System.out.println("Local Variablen sind immer nur innerhalb der Methode sichtbar.");
        System.out.println("Private Member Variablen sind immer nur innerhalb der Klasse sichtbar.");
        System.out.println("Public Member Variablen sind immer für alle Klassen sichtbar.");
        System.out.println("Private Methoden sind immer nur innerhalb der Klasse sichtbar.");
        System.out.println("Public Methoden sind immer für alle Klassen sichtbar.");

        System.out.println("Sichtbarkeit in Klassendiagrammen");
        System.out.println("Sichtbarkeit in Klassendiagrammen wird durch ein + für public, ein - für private und ein # für protected dargestellt.");
    }

    private static void outputMethodenAufruf() {
        //Beispiel
        System.out.println("Beispiel");
        System.out.println("int result = hp.add(5, 7);");
        System.out.println("Vom Objekt hp wird die Methode add aufgerufen");
        System.out.println("Das Objekt berechnet den Wert 5 + 7 und gibt diesen zurück");
    }

    private static void outputMethodenDeklaration() {
        //Methoden Deklaration
        //Beispiel
        System.out.println("Beispiel");
        System.out.println("int add(int a, int b) {");
        System.out.println("int = Datentyp Rückgabewert");
        System.out.println("add = Name der Methode");
        System.out.println("int a = 1.Parameter");
        System.out.println("int b = 2.Parameter");
        System.out.println("b = Variablename des 2.Parameters");
        System.out.println("return a + b = Rückgabewert");
    }

    private static void outputParameter() {
        //Parameter sind Variablen, die in der Methode deklariert werden und
        //die Werte enthalten, die an die Methode übergeben werden.
        //Parameter werden in der Methode Deklaration verwendet.
        System.out.println("Parameter sind Variablen, die in der Methode deklariert werden und");
        System.out.println("die Werte enthalten, die an die Methode übergeben werden.");
        System.out.println("Parameter werden in der Methode Deklaration verwendet.");
        System.out.println("Beispiel:");
        System.out.println("Main Methode: add(5, 10);");
        System.out.println("Übergabe von 5 und 10 an die Methode add");
        System.out.println("Methode add nimmt 5 und 10 als Parameter entgegen und speichert diese in den Variablen a und b");
        System.out.println("Methode add rechnet mit den Parametern a und b und gibt das Ergebnis zurück");
    }


}
