
//Q.no:4
// Java Program to Handle Divide By Zero Exception
package Task11;
public class ExceptionHandling {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10,b=0;
		try
		{
			System.out.println("The Division of a/b"+ a/b);//Throw Exception
		}
			catch(ArithmeticException e)//Exception Handler
		{
				System.out.println("Division by zero is not possible");
		}
	}

}
