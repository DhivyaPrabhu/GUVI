//Q.no:8
package Task11;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileNotFoundExceptionExample   
{
    public static void main(String[] args) {
        try {
            // Attempt to open the file
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            // Read data from the file
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("Error: The file does not exist.");
           
        }
    }
}