
import java.util.*;


public class Exercise1_2{
	 public static void main(String args[]){ 
	
	ArrayList<String> al= new ArrayList<String>();
    
	  al.add("red");
	  al.add("Green");
	  al.add("Orange");
	  al.add("White");
	  al.add("Black");
	  
	  System.out.println(al);
	  
	  
	  //Exercise 1. Write a Java program to remove the third element from a array list.
	  al.remove(2);
	  System.out.println("After removing third element from the list:\n"+al);
	  
	  //Exercise 2.Write a Java program to copy one array list into another.
	  List<String> al2 = new ArrayList<String>();
	  //Adding second list elements to the first list  
	  al2.addAll(al);  
	  System.out.println("Copy al to al2,\nAfter copy:");
	  //another method
	  Collections.copy(al2, al);
	  System.out.println("Copy al to al2,\nAfter copy:");
	 }
}
