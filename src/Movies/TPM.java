package Movies;
import java.util.Stack;
import static java.util.Collections.reverse;

/* Last in First Out - Stack Structure to generate the Phantom Menace Plot line */
public class TPM {
    public static void phantom(){
        String protagonists[] = new String[] { "Qui-Gon", "Obi-Wan", "Jar Jar" };
        String antagonists[] = new String[] { "Sidious", "The Trade Federation"};
        String locations[] = new String[] { "The Trade Federation Mother-ship", "Naboo"};

        Stack<String> goodGuys = new Stack<String>();
        for (int i = 0; i < protagonists.length; i++)
            goodGuys.push(protagonists[i]);

        Stack<String> badGuys =new Stack<String>();
        for (int i = 0; i < antagonists.length; i++)
            badGuys.push(antagonists[i]);

        Stack<String> location = new Stack<String>();
        for (int i = 0; i < locations.length; i++)
            location.push(locations[i]);


        System.out.println("------Episode 1: The Phantom Menace -------");

        System.out.println(goodGuys.get(0) + " & " + goodGuys.get(1) + " are on " + location.get(0));
        System.out.println( badGuys.get(1)+ " try to kill " + goodGuys.get(0) + " & " + goodGuys.get(1) + " on " + badGuys.get(0)+ "' orders");
        System.out.println( badGuys.get(1) + " fails and they escape to " + location.get(1) + " where " + goodGuys.get(0) + " saves "+ goodGuys.get(2));

        //Meets Queen Padme Amidala & escape
        goodGuys.push("Padme Amidala");
        location.push("Tatooine");

        System.out.println("They save " + goodGuys.get(3) + " and escape, on their damaged ship, to " + location.get(2));

        //Meets Anakin & Leaving
        goodGuys.push("Anakin Skywalker");
        badGuys.push("Watto");
        badGuys.push("Maul");
        location.push("Courscant");
        System.out.println( "On " + location.get(2) + ", They meet the Slave " + goodGuys.get(4) + " who wins their parts to fix the ship");
        System.out.println( goodGuys.get(0) + " barters with " + badGuys.get(2) + " for " + goodGuys.get(4) + "'s freedom and wins");
        System.out.println(goodGuys.get(0)  + " sees " + badGuys.get(3) + " and assists on a hasty departure to " + location.get(3));

        //Coruscant
        System.out.println( goodGuys.get(0) + " is shunned by the the Jedi Council on " + location.get(3));
        System.out.println( goodGuys.get(3) + " is manipulated by " + badGuys.get(0));

        //Back to Naboo

        //reverse used because FILO method to reverse the array before mutation
        reverse(location);
        reverse(goodGuys);
        String FedShip = location.pop();
        String Master = goodGuys.pop();
        String Sith = badGuys.pop();
        //reverse back
        reverse(goodGuys);
        System.out.println( goodGuys.get(2) + " decides to return to Naboo with " + Master + "& " + goodGuys.get(0));
        System.out.println( goodGuys.get(3) + " blows up " + FedShip);
        System.out.println( goodGuys.get(3) + ", with the help of " + goodGuys.get(2) + ", takes back " + location.get(2));
        System.out.println(Master + " dies by " + Sith+ "'s hand.");
        System.out.println("Jedi allow " + goodGuys.get(3) + " to be trained by " + goodGuys.get(0)+".");

        System.out.println("---Remaining People ----");
        System.out.println(goodGuys);
        System.out.println(badGuys);
    }
}
