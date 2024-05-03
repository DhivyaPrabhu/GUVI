package day9Task;
import java.text.DecimalFormat;

import java.util.Scanner;  
public class Q6 {
	//for decimal part
	private static final DecimalFormat decfor = new DecimalFormat("0.00");  
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter the number of month");
		System.out.println("enter the number of days you wants to stay");
		int month=sc1.nextInt();
		int days=sc2.nextInt();
		float Rent=1500.00f;
		float normal=Rent*days;
		float peak=((Rent+(Rent*0.200f))*days);
		//number refers the month
		switch(month)
		{
		case 1:
		      System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		   case 2:
			   System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 3:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 4:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(peak));
		      break;
		    case 5:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(peak));
		      break;
		    case 6:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(peak));
		      break;
		    case 7:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 8:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 9:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 10:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(normal));
		      break;
		    case 11:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(peak));
		      break;
		    case 12:
		    	System.out.println("Hotel Tariff to be paid is :  " +decfor.format(peak));
		      break;
		    
		     
		    default: System.out.println("Invalid Input");
		    break;
		}
	
	}

}
