//Q.No:3
package Task12;

import java.util.TreeMap;

public class DemoTreemaping {

	public static void main(String[] args)
	{
		// Declaration part
				TreeMap<Integer,String> emp=new TreeMap<>();
				
		// Adding employee IDs and names to the TreeMap
				emp.put(103, "Kavi");
				emp.put(102, "Divi");
				emp.put(104, "Pavi");
				emp.put(101, "Bhuvi");
		//Printing the IDs and Names
				System.out.println("Employee Names and IDs in alphabetical order:");
				
				for(Integer k:emp.keySet())
				{
					String Name=emp.get(k);
					System.out.println(" ID:"+" "+k + "    "+"Name :"+Name);
				}
	}

}
