import java.util.*;

public class EXC_4_5 {
	
	 public static void main(String[] args) {
		 /*Exercsie 4. Write a Java program to iterate through all elements in a linked list starting at the specified position.
		   Position no 1. sample list is of colors with element "Red","Green","White","Black","Yellow".
		 	Output will be "Green","White","Black","Yellow".*/
		    
		     LinkedList<String> ll = new LinkedList<String>();
		   
		     ll.add("Red");
		     ll.add("Green");
		     ll.add("Black");
		     ll.add("White");
		     ll.add("Pink");
		     System.out.println(ll);
		     System.out.println(" \n print list from second position");
		   Iterator p = ll.listIterator(1);
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
		  /* Exercise 5. Write a Java program to insert elements into the linked list at the first and last position. 
		   * Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.*/
		   ll.addFirst("Pink");
		   ll.addLast("Blue");
		   System.out.println("\n After add first and last linked list:" + ll);
		   
	 }

}
