package day9Task;
import java.util.Scanner;

public class Q3 {
	

	public static void main(String[] args) 
	{
		
		 int i,j,n,count=0;
		   System.out.print("Input number of rows : ");
		 Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   for(i=1;i<=n;i++)
		   {
			for(j=1;j<=i;j++)
			{
			count++;
			  System.out.print(count);
			}
		    System.out.println("");
		    }
		
	}

}
