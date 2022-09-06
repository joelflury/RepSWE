import java.util.*;

public class LineareDatenstrukturen {
    public static void menu() {
        //Import Scanner
        Scanner sc = new Scanner(System.in);
        //Ask for input
        //Menu
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Queue");
        System.out.println("4. Stack");
        System.out.println("5. HashSet");
        System.out.println("6. LinkedHashSet");
        System.out.println("7. HashMap");
        System.out.println("8. LinkedHashMap");
        System.out.println("9. HashInformationen");
        System.out.println("10. Datentypen");
        System.out.println("11. WeitereMethoden");
        System.out.println("11. Hilfskalssen");
        System.out.println("13. Return to main menu");
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
                System.out.println("You entered a number that is not between 1 and 13");
        }
    }

    public static void outputArrayList() {
        //Lineare Datenstrukturen
        //Sind eindimensionale Datenstrukturen
        //Werden als abstrakte Datenstrukturen angeboten
        //Verwalten Objekte einer Klasse
        //Objekte werden gekapselt abgelegt
        //Definiert was die Methode machen soll
        //Befindet sich im Package java.util
        //Werden auch Collections genannt

        //ArrayList
        //Anwendung: Verwalten von Objekten in einer Liste mit Index
        //Pros: Schnelle Zugriffe auf Elemente
        //Cons: Elemente müssen hintereinander abgelegt werden
        System.out.println("ArrayList erstellen");
        List<String> list = new ArrayList<String>();
        list.add("Hallo Welt");
        list.add("Hallo Welt2");
        list.add("Hallo Welt3");
        System.out.println("ArrayList Elemente ausgeben");
        System.out.println(list);
        System.out.println("");

        //lesen
        System.out.println("ArrayList 1. Position lesen:");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("");

        //schreiben
        System.out.println("ArrayList an 1. Position schreiben:");
        list.set(0, "Hallo Weltall");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("");

        //einfügen
        System.out.println("ArrayList an 2. Position einfuegen:");
        list.add(1, "Hallo Mond");
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println("");

        //löschen
        System.out.println("ArrayList an 3. Position loeschen:");
        list.remove(2);
        System.out.println(list);
        System.out.println(list);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputLinkedList() {
        //LinkedList
        //Anwendung: Verwalten von Objekten in einer Liste mit Index
        //Pros: Schnelle Zugriffe auf Elemente
        //Cons: Elemente müssen hintereinander abgelegt werden
        System.out.println("LinkedList erstellen");
        List<String> list = new ArrayList<String>();
        list.add("Hallo Welt");
        list.add("Hallo Welt2");
        list.add("Hallo Welt3");
        System.out.println("LinkedList Elemente ausgeben");
        System.out.println(list);
        System.out.println("");

        //lesen
        System.out.println("LinkedList 1. Position lesen:");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("");

        //schreiben
        System.out.println("LinkedList an 1. Position schreiben:");
        list.set(0, "Hallo Weltall");
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("");

        //einfügen
        System.out.println("LinkedList an 2. Position einfuegen:");
        list.add(1, "Hallo Mond");
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println("");

        //löschen
        System.out.println("LinkedList an 3. Position loeschen:");
        list.remove(2);
        System.out.println(list);
        System.out.println(list);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputQueue() {
        //Queue
        //Anwendung: Druckwarteschlange
        //           Callcenter
        //           Gui Event-Queue
        //First In First Out

        //Queue erstellen
        System.out.println("Queue erstellen");
        Queue<String> queue = new LinkedList<String>();
        queue.add("Hallo Welt");
        queue.add("Hallo Welt2");
        queue.add("Hallo Welt3");
        System.out.println("Queue Elemente ausgeben");
        System.out.println(queue);
        System.out.println("");

        //einfügen
        System.out.println("Queue an 1. Position einfuegen:");
        queue.add("Hallo Mond");
        System.out.println(queue);

        //lesen und löschen
        System.out.println("Queue an 1. Position lesen und loeschen:");
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("");

        //lesen ohne löschen
        System.out.println("Queue an 1. Position lesen ohne loeschen:");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputStack() {
        //Stack
        //Anwendung: Objekte werden auf einen Stapel gelegt
        //           Verarbeitung von Klammerstrukturen
        //           Call-Stack
        //Last In First Out

        //Stack erstellen
        System.out.println("Stack erstellen");
        Stack<String> stack = new Stack<String>();
        stack.push("Hallo Welt");
        stack.push("Hallo Welt2");
        stack.push("Hallo Welt3");
        System.out.println("Stack Elemente ausgeben");
        System.out.println(stack);
        System.out.println("");

        //einfügen
        System.out.println("Stack an 1. Position einfuegen:");
        stack.push("Hallo Mond");
        System.out.println(stack);
        System.out.println("");

        //lesen und löschen
        System.out.println("Stack an 1. Position lesen und loeschen:");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("");

        //lesen ohne löschen
        System.out.println("Stack an 1. Position lesen ohne loeschen:");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputHashSet() {
        //HashSet
        //Anwendung: Verwalten von Objekten in einer Liste ohne Index
        //           Keine doppelten Elemente erlaubt
        //           Lottozahlengenerator
        //Pros: Schnelle Zugriffe auf Elemente
        //Cons: Elemente müssen hintereinander abgelegt werden

        //HashSet erstellen
        System.out.println("HashSet erstellen");
        Set<String> set = new HashSet<String>();
        set.add("Hallo Welt");
        set.add("Hallo Welt2");
        set.add("Hallo Welt3");
        System.out.println("HashSet Elemente ausgeben");
        System.out.println(set);
        System.out.println("");

        //lesen
        System.out.println("HashSet 1. Position lesen:");
        System.out.println(set.contains("Hallo Welt"));
        System.out.println(set);
        System.out.println("");

        //einfügen
        System.out.println("HashSet an 2. Position einfuegen:");
        set.add("Hallo Mond");
        System.out.println(set);
        System.out.println("");

        //löschen
        System.out.println("HashSet an 3. Position loeschen:");
        set.remove("Hallo Welt3");
        System.out.println(set);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputLinkedHashSet() {
        //LinkedHashSet
        //Anwendung: Verwalten von Objekten in einer Liste ohne Index
        //           Keine doppelten Elemente erlaubt
        //           Lottozahlengenerator
        //Pros: Schnelle Zugriffe auf Elemente
        //Cons: Elemente müssen hintereinander abgelegt werden

        //LinkedHashSet erstellen
        System.out.println("LinkedHashSet erstellen");
        Set<String> set = new LinkedHashSet<String>();
        set.add("Hallo Welt");
        set.add("Hallo Welt2");
        set.add("Hallo Welt3");
        System.out.println("LinkedHashSet Elemente ausgeben");
        System.out.println(set);
        System.out.println("");

        //lesen
        System.out.println("LinkedHashSet 1. Position lesen:");
        System.out.println(set.contains("Hallo Welt"));
        System.out.println(set);
        System.out.println("");

        //einfügen
        System.out.println("LinkedHashSet an 2. Position einfuegen:");
        set.add("Hallo Mond");
        System.out.println(set);
        System.out.println("");

        //löschen
        System.out.println("LinkedHashSet an 3. Position loeschen:");
        set.remove("Hallo Welt3");
        System.out.println(set);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputHashMap() {
        //HashMap
        //Anwendung: Verwalten von Objekten mit Hilfe von Schlüsseln
        //           Schlüssel muss eindeutig sein
        //           URL in IP-Adresse umwandeln
        //           Phonebook
        //Pros: Schnelle Zugriffe auf Elemente


        //HashMap erstellen
        System.out.println("HashMap erstellen");
        Map<String, String> map = new HashMap<String, String>();
        map.put("b", "Hallo Welt");
        map.put("a", "Hallo Welt2");
        map.put("c", "Hallo Welt3");
        System.out.println("HashMap Elemente ausgeben");
        System.out.println(map);
        System.out.println("");

        //lesen
        System.out.println("HashMap 1. Position lesen:");
        System.out.println(map.get("b"));
        System.out.println(map);
        System.out.println("");

        //einfügen
        System.out.println("HashMap an 2. Position einfuegen:");
        map.put("d", "Hallo Mond");
        System.out.println(map);
        System.out.println("");

        //löschen
        System.out.println("HashMap an 3. Position loeschen:");
        map.remove("c");
        System.out.println(map);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void outputLinkedHashMap() {
        //LinkedHashMap
        //Anwendung: Verwalten von Objekten mit Hilfe von Schlüsseln
        //           Schlüssel muss eindeutig sein
        //           URL in IP-Adresse umwandeln
        //           Phonebook
        //Pros: Schnelle Zugriffe auf Elemente

        //HashMap erstellen
        System.out.println("LinkedHashMap erstellen");
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("b", "Hallo Welt");
        map.put("a", "Hallo Welt2");
        map.put("c", "Hallo Welt3");
        System.out.println("LinkedHashMap Elemente ausgeben");
        System.out.println(map);
        System.out.println("");

        //lesen
        System.out.println("LinkedHashMap 1. Position lesen:");
        System.out.println(map.get("b"));
        System.out.println(map);
        System.out.println("");

        //einfügen
        System.out.println("LinkedHashMap einfuegen:");
        map.put("d", "Hallo Mond");
        System.out.println(map);
        System.out.println("");

        //löschen
        System.out.println("LinkedHashMap loeschen:");
        map.remove("c");
        System.out.println(map);
        System.out.println("");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
        }

    public static void HashInformationen() {
        //Hashfunction
        //Schlüssel wird in einen Hashwert umgewandelt
        //Schlüssel durch eine arithmetische Funktion in einen Hashwert umgewandelt
        //Beispiel einer Hashfunktion
        //Divisionsmethode
        //Schlüssel wird binär dargestellt
        //Schlüssel wird durch eine Primzahl dividiert

        //Beispiel Berechnung Hashadresse
        //Schlüssel: 1001
        //Primzahl: 11
        System.out.println("Beispiel Berechnung Hashadresse");
        System.out.println("Schlüssel: 1001");
        System.out.println("Primzahl: 11");
        System.out.println("Hashadresse: 1001 % 11 = 9");
        System.out.println("");

        //Kollision
        //Zwei Schlüssel werden in die gleiche Hashadresse umgewandelt
        //Beispiel Kollision
        //Schlüssel 1: 1001
        //Schlüssel 2: 1011
        //Primzahl: 11
        System.out.println("Beispiel Kollision");
        System.out.println("Schlüssel 1: 1001");
        System.out.println("Schlüssel 2: 1011");
        System.out.println("Primzahl: 11");
        System.out.println("Hashadresse: 1001 % 11 = 9");
        System.out.println("Hashadresse: 1011 % 11 = 9");
        System.out.println("");

        //Kollisionen vermeiden
        System.out.println("Kollisionen vermeiden");
        System.out.println("Separate Chaining");
        System.out.println("Double Hashing");
        System.out.println("Resizing");

        //Separate Chaining
        //Kollisionen werden in einer Liste gespeichert
        //Beispiel Separate Chaining
        System.out.println("Beispiel Separate Chaining");
        System.out.println("Schlüssel 1: 1001");
        System.out.println("Schlüssel 2: 1011");
        System.out.println("Primzahl: 11");
        System.out.println("Liste wird erstellt");
        System.out.println("Hashadresse: 1001 % 11 = 9");
        System.out.println("=");
        System.out.println("Hashadresse: 1011 % 11 = 9");
        System.out.println("Kollisionen werden in einer Liste gespeichert");
        System.out.println("");

        //Double Hashing
        //Bei einer Kollision wird ein zweiter Hashwert berechnet
        System.out.println("Double Hashing");
        System.out.println("Bei einer Kollision wird ein zweiter Hashwert berechnet");

        //Resizing
        //Bei einer Kollision wird die Größe des Arrays vergrößert
        System.out.println("Resizing");
        System.out.println("Bei einer Kollision wird die Größe des Arrays vergrößert");

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void Datentypen() {
        //Raw Type
        //Liste die Objekte beliebiger Typen speichern kann
        //nicht typsicher
        //Zugriff muss explizit gecastet werden
        //Beispiel Raw Type
        System.out.println("Beispiel Raw Type");
        List list = new ArrayList();
        list.add("Hallo Welt");
        String s = (String) list.get(0);
        System.out.println(s);

        //Parametrierte Typen
        //Liste die nur Objekte eines bestimmten Typs speichern kann
        //typsicher
        //Zugriff muss nicht explizit gecastet werden
        //Beispiel Parametrierte Typen
        System.out.println("Beispiel Parametrierte Typen");
        List<String> list2 = new ArrayList<String>();
        list2.add("Hallo Welt");
        String s2 = list2.get(0);
        System.out.println(s2);

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void WeitereMethoden() {
        List<String> c1 = new ArrayList<String>();

        if (c1.isEmpty()) {
            System.out.println("Liste ist leer");
        }

        c1.add("Hallo Welt");
        c1.add("Hallo Mond");
        c1.add("Hallo Sonne");

        System.out.println("Anzahl Elemente: " + c1.size());

        if (c1.contains("Hallo Mond")) {
            System.out.println("Liste enthält Hallo Mond");
        }

        Object[] array = c1.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        List<String> c2 = new ArrayList<String>();
        List<String> c3 = new ArrayList<String>();

        c2.add("Hallo Welt");
        c2.add("Hallo Mond");
        c2.add("Hallo Sonne");

        c3.add("Hallo Welt");
        c3.add("Hallo Sonne");

        if (c2.containsAll(c3)) {
            System.out.println("Liste enthält alle Elemente");
        }

        c2.addAll(c3);
        System.out.println("Liste: " + c2);
        c2.removeAll(c3);
        System.out.println("Liste: " + c2);
        c2.add("Hallo Mars");
        System.out.println("Liste: " + c2);
        c2.retainAll(c3);
        System.out.println("Liste: " + c2);

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }

    public static void Hilfsklasse(){
        //Elemente erklaeren
        List<String> c1 = new ArrayList<String>();
        List<String> c2 = new ArrayList<String>();
        c1.add("Hallo Welt");
        c1.add("Hallo Mond");
        c1.add("Hallo Sonne");
        System.out.println("Liste 1: " + c1);

        //Listen kopieren
        //copy()
        //Beispiel copy()
        System.out.println("Beispiel copy()");
        Collections.copy(c2, c1);
        System.out.println("Liste 2: " + c2);

        //gleiche Elemente zählen
        //frequency()
        //Beispiel frequency()
        System.out.println("Beispiel frequency()");
        System.out.println("Anzahl Hallo Welt: " + Collections.frequency(c1, "Hallo Welt"));

        //grösseres Element bestimmen
        //max()
        //Beispiel max()
        System.out.println("Beispiel max()");
        System.out.println("Größtes Element: " + Collections.max(c1));

        //kleineres Element bestimmen
        //min()
        //Beispiel min()
        System.out.println("Beispiel min()");
        System.out.println("Kleinste Element: " + Collections.min(c1));

        //Bestimmtes Element ersetzen
        //replaceAll()
        //Beispiel replaceAll()
        System.out.println("Beispiel replaceAll()");
        Collections.replaceAll(c1, "Hallo Mond", "Hallo Mars");
        System.out.println("Liste 1: " + c1);

        //Zufälliges Mischen
        //shuffle()
        //Beispiel shuffle()
        System.out.println("Beispiel shuffle()");
        Collections.shuffle(c1);
        System.out.println("Liste 1: " + c1);

        //Sortieren
        //sort()
        //Beispiel sort()
        System.out.println("Beispiel sort()");
        Collections.sort(c1);
        System.out.println("Liste 1: " + c1);

        //Zwei Elemente tauschen
        //swap()
        //Beispiel swap()
        System.out.println("Beispiel swap()");
        Collections.swap(c1, 0, 1);
        System.out.println("Liste 1: " + c1);

        //Elemente um eine bestimmte Anzahl verschieben
        //rotate()
        //Beispiel rotate()
        System.out.println("Beispiel rotate()");
        Collections.rotate(c1, 1);
        System.out.println("Liste 1: " + c1);

        //unveränderliche Liste erzeugen
        //unmodifiableList()
        //Beispiel unmodifiableList()
        System.out.println("Beispiel unmodifiableList()");
        List<String> c3 = Collections.unmodifiableList(c1);
        System.out.println("Liste 3: " + c3);

        //Menu aufrufen
        System.out.println("Menu aufrufen");
        menu();
    }



}
