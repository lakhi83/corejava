package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 =new HashMap<Integer,String>();
		
		map1.put(1, "Lakhvinder Singh");
		map1.put(2, "Yashdeep  Singh");
		map1.put(3, "Harleen Kaur");
		
		
		System.out.println(map1);
		
		/*map1.put(2, "john");
		System.out.println(map1); //Update the data;
		
		map1.remove(3);// remove the data;
		System.out.println(map1); */
		
	
	//================================================
	/*
		LinkedHashMap<Integer,String> map2 =new LinkedHashMap<Integer,String>();
	
		map2.put(1, "Lakhvinder Singh");
		map2.put(2, "Yashdeep  Singh");
		map2.put(3, "Harleen Kaur");
		System.out.println(map2);*/
		
	//======================================================
	
		/*TreeMap<Integer,String> map3 =new TreeMap<Integer,String>();
	
	
		map3.put(1, "Lakhvinder Singh");
		map3.put(2, "Yashdeep  Singh");
		map3.put(3, "Harleen Kaur"); */
	
	for( Map.Entry<Integer,String> entry1 :map1.entrySet()) 
	{
	
	//System.out.println(entry1.getKey());
	//System.out.println(entry1.getValue());
	System.out.println(entry1.getValue());
	System.out.println(entry1.getKey());
	}
	}
}

