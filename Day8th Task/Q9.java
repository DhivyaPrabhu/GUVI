package DailyTasks;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) 
	{
	int age;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Person's age: ");
	age=sc.nextInt();
	if(age>60)
		System.out.println("The Person is a Senior Citizen");
	else
		System.out.println("The Person is not a Senior Citizen");


	}

}
