package day9Task;
import java.util.Scanner;
public class Q5 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter Your Mark");
	int mark=sc.nextInt();
	if(mark==100)
	{
		System.out.println("Your Grade is : S ");
	}
	else if (mark>100)
	{
		System.out.println("Invalid input");
	}
		//For A Grade
		else if(mark>=90) 
		{
			System.out.println("Your Grade is : A ");
		}
		//For B Grade
		else if(mark>=80)
			{
				System.out.println("Your Grade is : B ");
			}
	
		//For C Grade
		else if(mark>=70)
				{
					System.out.println("Your Grade is : C ");
				}
		//For D Grade
		else if(mark>=60)
						{
						System.out.println("Your Grade is : D ");
						}
						
		//For E Grade
		else if(mark>=50)
							{
							System.out.println("Your Grade is : E ");
							}
		//For F Grade
		else if(mark<50)
							{
								System.out.println("Your Grade is : F ");
				}
				
	
	else
		System.out.println();
	
	}
	
	}


	

		
	
	


