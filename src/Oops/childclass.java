package Oops;

public class childclass extends person
{
	
	String profession;
	public childclass()
	{
		
	}
	public childclass(String Name, int age, String profession)
	{
		super();
		this.profession= profession;
	}
	
	
	public void print()
	{
		System.out.println("inside child");
	}
	


}


