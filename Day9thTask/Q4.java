package day9Task;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int k=sc.nextInt();

		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=k;j++)
			{
				if((i==j)||(i+j==k+1))
		
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}	
	}
}
