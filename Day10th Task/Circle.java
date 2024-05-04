//Question Number:3
package Day10Task;

import java.text.DecimalFormat;

public class Circle {
	private static final DecimalFormat decfor = new DecimalFormat("0.00");  
	private double radius;
	private String colour;
	  
	  public Circle(double r, String c) 
	  {
          radius = r;
          colour =c;
	  }
	  public Circle()
	  {
	    radius=7;
	    colour="Red";
	  }
	 
	  void  Circumference() 
	   {
	    double circumfrence=2 * Math.PI * radius;
	    System.out.println("The circumfrence of the Circle is : "+ decfor.format(circumfrence));
	  }
	

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.Circumference();
		System.out.println("The colour of the Circle is "+c.colour);
		

	}

}
