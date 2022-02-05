package collection;
import java.util.LinkedList;

public class Linklistexample {

	public static void main(String[] args)
	{
		
		LinkedList<String> List1 = new LinkedList<String>();
		
		List1.add("john");
		List1.add("Donald");
		List1.add("jack");
		List1.add("Lakhi");
		List1.addFirst("Rupa");
		
		System.out.println(List1);
		
		 
		 for(int index = 0;index<List1.size();index++) 
		 {
			 System.out.println(List1.get(index));
		 }


		

	}

}
