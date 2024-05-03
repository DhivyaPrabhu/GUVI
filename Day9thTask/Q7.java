package day9Task;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the 3 numbers: " );
		int a=sc1.nextInt();
		int b=sc2.nextInt();
		int c=sc3.nextInt();
		//comparing a and b and storing the largest number in a temp variable  
		int temp=a>b?a:b;  
		//comparing the temp variable with c and storing the result in the variable  
		int largest=c>temp?c:temp;  
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
		}
	}


