package Movies;

import java.util.LinkedList;
/*
This is an auto-generated recap of Return of the Jedi using LikedList
 */

public class ROTJ {
    public static void story() {
        System.out.println("-----Return of the Jedi -----");

        String protagonists[] = new String[] { "Lando", "Leia", "Chewie", "Luke" };
        String antagonist[] = new String[] { "Vader", "The Emperor" };
        // Declaring the LinkedList
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> antl = new LinkedList<>();

        // Re-Organize the Line 6 Characters into a linked list
        for (int i = 0; i < protagonists.length; i++)
            ll.add(protagonists[i]);
        for (int i = 0; i < antagonist.length; i++)
            antl.add(antagonist[i]);

        ll.add("Han");
        System.out.println(ll.get(3) + " Frees " + ll.get(4));
        //Uses each list together to concat.
        System.out.println(ll.get(3) + " Turns Himself over to " + antl.get(0));

        // Recount Vader's turn
        System.out.println(antl.get(1) + " Forces " + antl.get(0) + " to Duel " + ll.get(3));
        System.out.println(antl.get(1) + " commands " + ll.get(3) + " to kill " + antl.get(0));

        System.out.println(ll.get(3) + " refused and was shocked by " + antl.get(1));
        System.out.println(antl.get(0) + " saved and was redeemed by " + ll.get(3));

        //Vader now good guy
       ll.add(antl.get(0));
        antl.remove(0);

        System.out.println(ll.get(5) + " is now a good guy [protagonist]");

        System.out.println("---- End Protagonist Credits ----");
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
