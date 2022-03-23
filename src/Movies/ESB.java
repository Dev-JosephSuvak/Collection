package Movies;

import java.util.ArrayList;

/*
This is an auto-generated recap of Empire Strikes Back using ArrayList
 */

public class ESB {
    public static void arrayList() {
        String characters[] = new String[] { "Luke", "Han", "Leia", "Chewie" };
        // Declaring the ArrayList with
        // initial size n
        ArrayList<String> al = new ArrayList<>();

        // Append i to dynamically add characters
        for (int i = 0; i < characters.length; i++)
            al.add(characters[i]);

        // Printing elements
        System.out.println("-----Array List-----");
        System.out.println(al);

        // Remove element at index 3
        System.out.println(" --- Luke goes to Dagobah -- ");
        al.remove(0);
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
            System.out.println("are on the run from the Empire");

        al.add(0, "Lando");

        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
            System.out.println("are in Cloud City");

        //Save Han outside the ArrayList & remove
        String Han = al.get(1);
        al.remove(1);
        al.add( "Luke");
        System.out.println(al.get(3) + " returns" + " and " + Han + " is Frozen");
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " and " );
            System.out.println("escape Cloud City");

    }
}
