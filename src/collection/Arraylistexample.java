package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Arraylistexample {

	public static void main(String[] args)
	{
		
ArrayList<String> arraylist1 = new ArrayList<String>();
{
	
	 arraylist1.add("Raj");
	 arraylist1.add("Priya");
	 arraylist1.add("Reena");
	 arraylist1.add("Rohan");
	 System.out.println("the size of array is " +  arraylist1.size());
	 System.out.println( arraylist1);
	 
	 System.out.println("the element at o index is " +  arraylist1.get(0));
	 arraylist1.remove(0);
	 
	 System.out.println("the size of array is" +  arraylist1.size());
	 System.out.println( arraylist1);
	 
	
	 
	 for(int index = 0;index< arraylist1.size();index++) // iterating through loop
	 {
		 System.out.println( arraylist1.get(index));
	 }
	 
	 for( String name : arraylist1)          //advance for loop    
	 {
		 System.out.println(name);
	 }
	 
	 
	 Iterator<String> itr = arraylist1.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	 
	  //sorting of arrraylist
	  
	 Collections.sort(arraylist1);
	 System.out.println(arraylist1);
	  
	}
	}

}
