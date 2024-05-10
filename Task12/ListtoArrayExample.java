//Q.No:4
package Task12;

import java.util.ArrayList;
import java.util.List;

public class ListtoArrayExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Convert the List to an array of Strings
        String[] array = list.toArray(new String[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
