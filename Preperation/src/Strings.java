import java.util.Scanner;
import java.util.StringTokenizer;

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

    private static void outputStrings() {
        //Zeichenketten werden mit dem Referenz Datentyp String dargestellt
        //Variable text ist eine Referenz auf ein String Objekt
        //fixe Länge
        //erstes Zeichen hat Index 0
        //Operationen ändern Inhalt der Variable nicht

        //Deklaration
        //1. Variante
        String text1 = "Hallo";
        System.out.println(text1);
        System.out.println();

        //2. Variante
        String text2 = new String("Salut");
        System.out.println(text2);
        System.out.println();

    }

    private static void outputStringPosition() {
        //Positionen: 01234567

        String text = "ABCDABCD";
        int i;

        //Wie lange ist der Text?
        System.out.println("Länge: " + text.length());
        System.out.println();

        //An welcher Position steht das Zeichen?
        System.out.println("Position von C: " + text.indexOf('C'));
        System.out.println();

        //An welcher Position steht das Zeichen?
        //Gesucht ab einer bestimmten Position
        System.out.println("Position von C ab 4: " + text.indexOf('C', 4));
        System.out.println();

        //An welcher Position ist das letzte Zeichen?
        System.out.println("Position von B: " + text.lastIndexOf('B'));
        System.out.println();
    }

    private static void outputStringTeileLesen() {
        //Positionen: 01234567
        String text = "ABCDEFGH";

        //Ist der Teilstring enthalten?
        System.out.println("Enthält BC: " + text.contains("BC"));
        System.out.println();

        //Gebe das Zeichen einer Position aus
        System.out.println("Zeichen an Position 3: " + text.charAt(3));
        System.out.println();

        //Gebe den Teilstring zwischen 2 Positionen aus
        System.out.println("Teilstring von 2 bis 5: " + text.substring(2, 5));
        System.out.println();

        String text2 = "Das ist ein Text";
        //teile String in einzelne Wörter Variante 1
        System.out.println("Teile String in einzelne Wörter Variante 1");
        System.out.println("Text: " + text2);
        StringTokenizer tokens = new StringTokenizer(text2);
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
        System.out.println();

        //teile String in einzelne Wörter Variante 2
        System.out.println("Teile String in einzelne Wörter Variante 2");
        System.out.println("Text: " + text2);
        String[] words = text2.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

    private static void outputStringTeileBearbeiten() {
        String text = "Hallo Welt";
        String temp;

        //wandle alle Zeichen in Kleinbuchstaben um
        temp = text.toLowerCase();
        System.out.println("Kleinbuchstaben: " + temp);
        System.out.println();

        //wandle alle Zeichen in Großbuchstaben um
        temp = text.toUpperCase();
        System.out.println("Großbuchstaben: " + temp);
        System.out.println();

        //ersetze Zeichen1 mit Zeichen2
        temp = text.replace('a', 'e');
        System.out.println("Ersetze a mit e: " + temp);
        System.out.println();

        String text2 = "    Hallo Welt  ";
        String temp2;
        System.out.println("Text: " + text2);

        //entferne alle Leerzeichen und Tabulatoren
        temp2 = text2.trim();
        System.out.println("Entferne Leerzeichen und Tabulatoren: " + temp2);

        //hänge Text an (Variante 1)
        temp2 = text2.concat(" und Mars");
        System.out.println("Hänge Text an (Variante 1): " + temp2);

        //hänge Text an (Variante 2)
        temp2 = text2 + " und Mars";
        System.out.println("Hänge Text an (Variante 2): " + temp2);
    }

    private static void outputStringVergleichen() {
        String text1 = "Java ist toll";
        String text2 = "JAVA ist toll";

        //Vergleiche 2 Strings
        System.out.println("Vergleiche 2 Strings");
        System.out.println("Text1: " + text1);
        System.out.println("Text2: " + text2);

        //Inhalt vergleichen
        System.out.println("Inhalt vergleichen: " + text1.equals(text2));
        System.out.println();

        //Referenz vergleichen
        System.out.println("Referenz vergleichen");
        System.out.println("Text1 == Text2: " + (text1 == text2));
        System.out.println();

        String fileName = "MeinDokument.txt";
        boolean b;

        //Vergleich unabhaengig von Gross- und Kleinschreibung
        System.out.println("Vergleicht 2 Strings ohne Berücksichtigung von Groß- und Kleinschreibung");
        b = fileName.equalsIgnoreCase("meindokument.txt");

        //Beginnt der Text mit Teilstring?
        System.out.println("Beginnt der Text mit Teilstring Mein?");
        b = fileName.startsWith("Mein");

        //Endet der Text mit Teilstring?
        System.out.println("Endet der Text mit Teilstring txt?");
        b = fileName.endsWith("txt");

        //Positionen: 01234567
        String text3 = "ABCD";
        String text4 = "xyzBCxyz";

        //Passt ein bestimmter Bereich?
        System.out.println("Passt ein bestimmter Bereich?");
        System.out.println("Passt Bereich BC von Text3 in Text4: " + text4.regionMatches(3, text3, 1, 2));
        System.out.println();

        //unabhaengig von Gross- und Kleinschreibung
        text3 = "Java ist eine Programmiersprache";
        text4 = "Mit Java kann man programmieren";
        System.out.println("Passt ein bestimmter Teil aus Text4 in Text3: programmier " + text3.regionMatches(14, text4, 18, 11));
        System.out.println("Ja");
        System.out.println();

    }

    private static void outputStringBuilder() {
        //StringBuilder ist eine Klasse, die Strings erzeugt
        //und bearbeiten kann
        //StringBuilder erzeugen
        //Variable Länge
        //erstes Zeichen an Position 0
        //Operationen ändern den Inhalt der Variable
        System.out.println("StringBuilder erzeugen: StringBuilder text = new StringBuilder(\"Hallo Welt\");");
        StringBuilder text = new StringBuilder("Hallo Welt");
        System.out.println(text);
        System.out.println();

        //StringBuilder Zeichen löschen
        System.out.println("StringBuilder Zeichen löschen: text.deleteCharAt(5);");
        System.out.println("vorher: " + text);
        text.deleteCharAt(5);
        System.out.println("nachher: " + text);

        //StringBuilder Zeichen hinzufügen
        System.out.println("StringBuilder Zeichen hinzufügen: text.insert(5, \" \");");
        System.out.println("vorher: " + text);
        text.insert(5, "z");
        System.out.println("nachher: " + text);

        //StringBuilder Zeichen ersetzen
        System.out.println("StringBuilder Zeichen ersetzen: text.setCharAt(5, \" \");");
        System.out.println("vorher: " + text);
        text.setCharAt(5, 'X');
        System.out.println("nachher: " + text);

        //StringBuilder Text hinzufügen
        System.out.println("StringBuilder Text hinzufügen: text.append(\" und Mars\");");
        System.out.println("vorher: " + text);
        text.append(" und Mars");
        System.out.println("nachher: " + text);

        //StringBuilder Text einfügen
        System.out.println("StringBuilder Text einfügen: text.insert(0, \"Hallo \");");
        System.out.println("vorher: " + text);
        text.insert(0, "Hallo ");
        System.out.println("nachher: " + text);

        //StringBuilder Teilstring ersetzen
        System.out.println("StringBuilder Teilstring ersetzen: text.replace(0, 5, \"Guten Tag\");");
        System.out.println("vorher: " + text);
        text.replace(0, 5, "Guten Tag");
        System.out.println("nachher: " + text);

        //StringBuilder Reihenfolge umkehren
        System.out.println("StringBuilder Reihenfolge umkehren: text.reverse();");
        System.out.println("vorher: " + text);
        text.reverse();
        System.out.println("nachher: " + text);

        //Erklärung Verwaltung StringBuilder
        //Innerhalb der Klasse StringBuilder wird ein Array verwendet
        //Das Char-Array verdoppelt sich, wenn es voll ist
        System.out.println("Erklärung Verwaltung StringBuilder");
        System.out.println("Innerhalb der Klasse StringBuilder wird ein Array verwendet");
        System.out.println("Das Char-Array verdoppelt sich, wenn es voll ist");
        System.out.println("Kapazität setzen: StringBuilder text = new StringBuilder(10);");

    }

    private static void outputStringUmwandlung() {
        //StringBuilder
        System.out.println("StringBuilder erzeugen");
        StringBuilder myStringBuilder = new StringBuilder("Hallo Welt");
        System.out.println(myStringBuilder);

        //StringBuilder in String umwandeln
        System.out.println("StringBuilder in String umwandeln");
        String myString = myStringBuilder.toString();

        //String to int umwandeln
        System.out.println("String to int umwandeln");
        int myInt = Integer.parseInt("7");
        int myInt2 = Integer.valueOf("12");
        System.out.println(myInt);
        System.out.println(myInt2);

        //int to String umwandeln
        System.out.println("int to String umwandeln");
        myString = Integer.toString(7);
        System.out.println(myString);
        myString = String.valueOf(12);
        System.out.println(myString);
        myString = "" + 12;
        System.out.println(myString);
    }










}
