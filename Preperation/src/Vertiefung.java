import java.util.Scanner;

public class Vertiefung {
    public static void menu() {
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("1. JavaDoc");
        System.out.println("2. Statische Imports");
        System.out.println("3. Array mit Objekten");
        System.out.println("4. Array List mit Objekten");
        System.out.println("5. Objekte an Methoden übergeben");
        System.out.println("6. Ueberladen von Methoden");
        System.out.println("7. Ueberladen von Konstruktoren");
        System.out.println("13. Return to main menu");
        //Read input
        int input = sc.nextInt();

        //Switch Case
        switch (input) {
            case 1:
                System.out.println("JavaDoc");
                outputJavaDoc();
                break;
            case 2:
                System.out.println("Statische Imports");
                outputStaticImports();
                break;
            case 3:
                System.out.println("Array mit Objekten");
                outputArrayWithObjects();
                break;
            case 4:
                System.out.println("Array List mit Objekten");
                outputArrayListWithObjects();
                break;
            case 5:
                System.out.println("Objekte an Methoden übergeben");
                outputObjectsToMethods();
                break;
            case 6:
                System.out.println("Ueberladen von Methoden");
                outputOverloadingMethods();
                break;
            case 7:
                System.out.println("Ueberladen von Konstruktoren");
                outputOverloadingConstructors();
                break;
            case 13:
                System.out.println("Return to main menu");
                Main.main(null);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }

    private static void outputJavaDoc() {
System.out.println("JavaDoc");
        System.out.println("JavaDoc ist eine Dokumentationssprache für die Programmiersprache Java. " +
                "Sie wird verwendet, um die Struktur und die Funktionsweise von Java-Programmen zu beschreiben. " +
                "JavaDoc ist eine Erweiterung der Java-Programmiersprache, die es ermöglicht, Kommentare in einem speziellen Format zu schreiben," +
                "die dann automatisch in HTML-Dokumente umgewandelt werden können. " +
                "Diese HTML-Dokumente können dann von einem Webbrowser gelesen werden. " +
                "JavaDoc ist ein Teil des JDK und wird mitgeliefert. " +
                "JavaDoc ist ein Werkzeug, das die Dokumentation von Java-Programmen erleichtert");

        System.out.println("Syntax");
        System.out.println("beginnt mit /**");
        System.out.println("beliebig viele Zeilen");
        System.out.println("@ Elemente sind Makros");
        System.out.println("endet mit */");

        System.out.println("Beispiel");
        System.out.println("/**");
        System.out.println(" * This is a class");
        System.out.println(" *");
        System.out.println(" * @author Max Mustermann");
        System.out.println(" * @version 1.0");
        System.out.println(" * @since 1.0");
        System.out.println(" */");

        menu();
    }

    private static void outputStaticImports() {
        //Static Imports
        System.out.println("Statische Imports");
        System.out.println("Beispiel");
        System.out.println("import static java.lang.Math.*;");
        System.out.println("Für die Verwendung von oeffentlich statischen Elementen einer Klasse muss nicht mehr der Klassenname vorangestellt werden. " +
                "Stattdessen kann der Klassenname weggelassen werden. " +
                "Die statischen Elemente der Klasse werden dann direkt verwendet. " +
                "Beispiel: statt Math.PI kann nun PI verwendet werden.");

        System.out.println("Vergleich Import - static Import");
        System.out.println("Import");
        System.out.println("Vorteile: Eindeutigkeit der Elemente");
        System.out.println("Nachteile: mehr Code");
        System.out.println("Einsatz: Projekte");

        System.out.println("Static Import");
        System.out.println("Vorteile: weniger Code");
        System.out.println("Nachteile: Risiko von Namenskonflikten");
        System.out.println("Einsatz: Klasse mitielen systemout.println");

        menu();
    }

    private static void outputArrayWithObjects() {
        //Array mit Objekten
        System.out.println("Array mit Objekten");
        System.out.println("Beispiel");
        System.out.println("public class Person {");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    public Person(String name, int age) {");
        System.out.println("        this.name = name;");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    public String getName() {");
        System.out.println("        return name;");
        System.out.println("    }");
        System.out.println("    public int getAge() {");
        System.out.println("        return age;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("public class Main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        Person[] persons = new Person[3];");
        System.out.println("        persons[0] = new Person(\"Max\", 20);");
        System.out.println("        persons[1] = new Person(\"Moritz\", 21);");
        System.out.println("        persons[2] = new Person(\"Maria\", 22);");
        System.out.println("        for (int i = 0; i < persons.length; i++) {");
        System.out.println("            System.out.println(persons[i].getName() + \" \" + persons[i].getAge());");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}");

        menu();
    }

    private static void outputArrayListWithObjects() {
        //Array List mit Objekten
        System.out.println("Array List mit Objekten");
        System.out.println("Verwaltet Objekte");
        System.out.println("Beispiel");
        System.out.println("public class Person {");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    public Person(String name, int age) {");
        System.out.println("        this.name = name;");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    public String getName() {");
        System.out.println("        return name;");
        System.out.println("    }");
        System.out.println("    public int getAge() {");
        System.out.println("        return age;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("public class Main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        ArrayList<Person> persons = new ArrayList<>();");
        System.out.println("        persons.add(new Person(\"Max\", 20));");
        System.out.println("        persons.add(new Person(\"Moritz\", 21));");
        System.out.println("        persons.add(new Person(\"Maria\", 22));");
        System.out.println("        for (int i = 0; i < persons.size(); i++) {");
        System.out.println("            System.out.println(persons.get(i).getName() + \" \" + persons.get(i).getAge());");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}");

        menu();
    }

    private static void outputObjectsToMethods() {
        //Objekte an Methoden übergeben
        System.out.println("Objekte an Methoden übergeben");
        System.out.println("Beispiel");
        System.out.println("public class Person {");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    public Person(String name, int age) {");
        System.out.println("        this.name = name;");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    public String getName() {");
        System.out.println("        return name;");
        System.out.println("    }");
        System.out.println("    public int getAge() {");
        System.out.println("        return age;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("public class Main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        Person person = new Person(\"Max\", 20);");
        System.out.println("        printPerson(person);");
        System.out.println("    }");
        System.out.println("    public static void printPerson(Person person) {");
        System.out.println("        System.out.println(person.getName() + \" \" + person.getAge());");
        System.out.println("    }");
        System.out.println("}");

        menu();
    }

    private static void outputOverloadingMethods() {
        System.out.println("Überladene Methoden");
        System.out.println("eine Methode wird mehrfach definiert");
        System.out.println("Methodennamen sind identisch");
        System.out.println("Parameterlisten sind unterschiedlich in Anzahl, Datentyp oder Reihenfolge");
        System.out.println("Beispiel");
        System.out.println("public class Main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        print(1);");
        System.out.println("        print(\"Hallo\");");
        System.out.println("        print(1, \"Hallo\");");
        System.out.println("        print(\"Hallo\", 1);");
        System.out.println("    }");
        System.out.println("    public static void print(int i) {");
        System.out.println("        System.out.println(i);");
        System.out.println("    }");
        System.out.println("    public static void print(String s) {");
        System.out.println("        System.out.println(s);");
        System.out.println("    }");
        System.out.println("    public static void print(int i, String s) {");
        System.out.println("        System.out.println(i + \" \" + s);");
        System.out.println("    }");
        System.out.println("    public static void print(String s, int i) {");
        System.out.println("        System.out.println(s + \" \" + i);");
        System.out.println("    }");
        System.out.println("}");

        menu();
    }

    private static void outputOverloadingConstructors() {
        System.out.println("Überladene Konstruktoren");
        System.out.println("eine Klasse kann mehrere Konstruktoren haben");
        System.out.println("Konstruktornamen sind identisch");
        System.out.println("Parameterlisten sind unterschiedlich in Anzahl, Datentyp oder Reihenfolge");
        System.out.println("Beispiel");
        System.out.println("public class Person {");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    public Person(String name, int age) {");
        System.out.println("        this.name = name;");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    public Person(String name) {");
        System.out.println("        this.name = name;");
        System.out.println("    }");
        System.out.println("    public Person(int age) {");
        System.out.println("        this.age = age;");
        System.out.println("    }");
        System.out.println("    public Person() {");
        System.out.println("    }");
        System.out.println("    public String getName() {");
        System.out.println("        return name;");
        System.out.println("    }");
        System.out.println("    public int getAge() {");
        System.out.println("        return age;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("public class Main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        Person person1 = new Person(\"Max\", 20);");
        System.out.println("        Person person2 = new Person(\"Moritz\");");
        System.out.println("        Person person3 = new Person(21);");
        System.out.println("        Person person4 = new Person();");
        System.out.println("    }");
        System.out.println("}");

        menu();
    }
}
