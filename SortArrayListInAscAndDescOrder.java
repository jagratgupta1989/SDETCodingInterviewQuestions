package JavaCoding;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInAscAndDescOrder {
	
	public static void sortArrayListInAscAndDescOrder()
	{
		ArrayList l = new ArrayList();
		l.add("Alex");
		l.add("Jagrat");
		l.add("Bob");
		l.add("Natalia");
		System.out.println("Original List is"+" "+ l);
		//Collections.sort(l); // Ascending Order
		Collections.sort(l, Collections.reverseOrder()); //Desending Order
		System.out.println("Sorted List is"+" "+ l);
		
	}

	public static void main(String[] args) {
		
		sortArrayListInAscAndDescOrder();
	}

}
