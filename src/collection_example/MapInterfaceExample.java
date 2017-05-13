package collection_example;

import java.util.*;

public class MapInterfaceExample {
	public static void main(String args[]){
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");
		map.put(101,"Viijay");
		map.put(102,"Rahul");
		Stack<String> mystack = new Stack<>();
		mystack.push("Tanmoy");
		System.out.println(mystack.pop());
		
		for(Map.Entry m:map.entrySet())
		{  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}
