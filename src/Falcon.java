import java.util.Hashtable;
import java.util.Vector;

public class Falcon {
    public static void millenniumFalcon() {
        //Original Java
        String characters[] = new String[] { "Luke", "Han", "Leia", "Chewie" };
        Vector<String> v = new Vector();
        /* Hastable <key type, value type> name = new Hashtable
        * I chose a String because it would have to be exact and deliberate vs. an insecure iterative integer
        * */
        Hashtable<String, String> h = new Hashtable();


        v.addElement(characters[1]);
        v.addElement(characters[2]);
        v.addElement(characters[3]);

        h.put("Falcon", characters[1]);
        h.put("Falcon-CoPilot", characters[3]);


        System.out.println("<------------Print Characters-------------->");
        System.out.println(characters[0]);

        //Prints out the Vector Object
        System.out.println("----Vector----");
        System.out.println(v);

        //Print all within the Vector Individually
        System.out.println("----List out characters via Vector----");
        v.forEach((name) -> System.out.println(name));

        //Get one pilot from Hashtable
        System.out.println("----Get Han from Hash----");
        System.out.println(h.get("Falcon"));

        //Print all within the Hash Table individually
        System.out.println("----Get characters from Hash----");
        h.forEach((key,value) -> System.out.println(value));
    }
}
