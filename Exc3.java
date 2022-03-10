import java.util.ArrayList;

public class Exc3 {

	public static void main(String[] args) {
		
		//Exercise 3.Write a Java program to print all the elements of a ArrayList using the position of the elements. 
		  ArrayList <String> c1 = new ArrayList <String> ();
		  c1.add("A");
		  c1.add("B");
		  c1.add("C");
		  c1.add("D");
		  c1.add("E");
		  System.out.println("\nOriginal array list: " + c1);
		  System.out.println("\nPrint using index of an element: ");
		  int a = c1.size();
		  for (int i = 0; i < a; i++)
		   System.out.printf("\n%d - %s",i,c1.get(i));
		 }
		
	}

