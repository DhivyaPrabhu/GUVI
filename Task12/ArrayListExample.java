//Q.No:2
package Task12;

import java.util.ArrayList;

public class ArrayListExample {

	
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to the ArrayList
        al.add("Ramu");
        al.add("Somu");
        al.add("Naresh");
        al.add("Suresh");
        // Printing the ArrayList before removal
        System.out.println("ArrayList before removal: " + al);

        // Removing all elements from the ArrayList
        al.clear();

        // Printing the ArrayList after removal
        System.out.println("ArrayList after removal: " + al);
        System.out.println("The Array List is Empty = "+" "+ al.isEmpty());
    }
}


