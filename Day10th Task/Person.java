
//Question Number:1
package Day10Task;
	// Person.java
	public class Person 
	{
	    String name;
	    int age;
	    Person(String name, int age) 
	    {
	        this.name = name;
	        this.age = age;
	    }
	    String getName() 
	    {
	        return name;
	    }
	    int getAge() 
	    {
	        return age;
	    }
	
	
	public static void main(String[] args) 
	{		//Main class for person
		    Person person1 = new Person("Ramu", 11);
		    Person person2 = new Person("Somu", 12);
		    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
		    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
	}
	}
