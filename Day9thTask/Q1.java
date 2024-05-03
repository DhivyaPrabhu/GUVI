package day9Task;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String");
		String str=sc.next();
		String org_Str=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_Str.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Given String is not Palindrome");
	}

}
