//Q.No:5
package Task11;

public class ArrayStringOutofBoundException {
	

	public static void main(String[] args) {
		String s = "example";  
		  
		try {
            int number[] = new int[20];
            number[21] = 30 / 9;
            // this statement will throw
            // ArrayIndexOutOfBoundsException e
        }
        catch (ArrayIndexOutOfBoundsException
               | ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("The Index value is out of bounds");
        }
		
		try {  
		    String substring = s.substring(2, 8); // throws StringIndexOutOfBoundsException  
		} catch (StringIndexOutOfBoundsException e) {  
		    // catch the exception and log an error message  
		    System.err.println("String index is out of bounds: " + e.getMessage());  
		}System.out.println("It is StringOutofBoundsIndex");
	}

}
