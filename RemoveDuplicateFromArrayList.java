package JavaCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayList {
	
	public static void removeDuplicateFromArrayList()
	{
		ArrayList l =new ArrayList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(50);
		System.out.println("Original List is:"+" "+ l);
		System.out.println("\n");
		//HashSet s =new HashSet();
		LinkedHashSet s =new LinkedHashSet();
		s.addAll(l); //Converting List to Set
		System.out.println("After Removing Elements are:"+" "+ s);
		//ArrayList f1=new ArrayList();
		//f1.addAll(s); //Converting Set to List
		//System.out.println("After Removing Elements are:"+" "+ f1);
	}

	public static void main(String[] args) {

		removeDuplicateFromArrayList();

	}

}
