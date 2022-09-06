import java.util.Scanner;

public class Konstruktoren {
    public static void menu() {
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("1. Arbeitsschritte");
        System.out.println("2. Klassendiagramm");
        System.out.println("3. Klasse");
        System.out.println("4. Objekt");
        System.out.println("5. Methodenaufruf");
        System.out.println("6. Konstruktor");
        System.out.println("7. Default Konstruktor");
        System.out.println("8. Return to main menu");
        //Read input
        int input = sc.nextInt();

        //Switch Case
        switch (input) {
            case 1:
                System.out.println("Arbeitsschritte");
                outputArbeitsschritte();
                break;
            case 2:
                System.out.println("Klassendiagramm");
                outputKlassendiagramm();
                break;
            case 3:
                System.out.println("Klasse");
                outputKlasse();
                break;
            case 4:
                System.out.println("Objekt");
                outputObjekt();
                break;
            case 5:
                System.out.println("Methodenaufruf");
                outputMethodenaufruf();
                break;
            case 6:
                System.out.println("Konstruktor");
                outputKonstruktor();
                break;
            case 7:
                System.out.println("Default Konstruktor");
                outputDefaultKonstruktor();
                break;
            case 8:
                System.out.println("Return to main menu");
                Main.main(null);
                break;
            default:
                System.out.println("Input 1-8");
                break;
        }
    }

    private static void outputArbeitsschritte() {
        System.out.println("1. Klassendiagramm erstellen");
        System.out.println("2. Klasse definieren");
        System.out.println("3. Objekt erzeugen");
        System.out.println("4. Methodenaufruf auf Objekt");
        System.out.println("5. Programm starten");

        outputKlassendiagramm();
    }

    private static void outputKlassendiagramm() {
        //Klassendiagramm zeichnen
        System.out.println("Klassendiagramm zeichnen");
        System.out.println("Klasse: Person");
        System.out.println("Attribute: name, age");
        System.out.println("Methoden: printName(), printAge()");
        System.out.println("Klassenname Großbuchstabe");
        System.out.println("Eigenschaften adjektive, private mit -, public mit +");
        System.out.println("Verhalten wird mit Methoden beschrieben");
        System.out.println("Methodenname kleinbuchstabe, verben, private mit -, public mit +, Ergebnis mit : (void), BsP: printName():void");


        outputKlasse();
    }

    private static void outputKlasse() {
        //Klasse definieren
        System.out.println("Klasse definieren");
        System.out.println("public class Person {");
        System.out.println("    //Attribute");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    //Konstruktor");
        System.out.println("    public Person(String name, int age) {");
        System.out.println("        this.name = name;");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    //Methoden");
        System.out.println("    public void printName() {");
        System.out.println("        System.out.println(name);");
        System.out.println("    }");
        System.out.println("    public void printAge() {");
        System.out.println("        System.out.println(age);");
        System.out.println("    }");
        System.out.println("}");

        outputObjekt();
    }

    private static void outputObjekt() {
        //Objekt erzeugen
        System.out.println("Objekt erzeugen");
        System.out.println("Person p = new Person(\"Max\", 20);");

        outputMethodenaufruf();
    }

    private static void outputMethodenaufruf() {
        //Methodenaufruf
        System.out.println("Methodenaufruf");
        System.out.println("p.printName();");
        System.out.println("p.printAge();");

        menu();

    }

    private static void outputKonstruktor() {
        System.out.println("Konstruktor");
        System.out.println("spezielle Methode");
        System.out.println("gleicher Name wie Klasse");
        System.out.println("einmalig aufgerufen");
        System.out.println("Membervariablen initialisieren");
        System.out.println("Beispiel");
        System.out.println("public Person(String name, int age) {");
        System.out.println("    this.name = name;");
        System.out.println("    this.age = age;");
        System.out.println("}");

        //Konstruktor ansteuern
        System.out.println("Konstruktor ansteuern");
        System.out.println("Person p = new Person(\"Max\", 20);");

        menu();
    }

    private static void outputDefaultKonstruktor() {
        System.out.println("Default Konstruktor");
        System.out.println("wird automatisch erzeugt");
        System.out.println("wenn kein Konstruktor definiert");
        System.out.println("wird automatisch aufgerufen");
        System.out.println("wenn kein Konstruktor aufgerufen wird");
        System.out.println("wird automatisch aufgerufen");
        System.out.println("wenn kein Konstruktor aufgerufen wird");


        menu();
    }
}
