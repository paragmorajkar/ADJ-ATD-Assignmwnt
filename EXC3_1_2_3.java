import java.util.*;

public class EXC3_1_2_3 {
	public static void main(String args[]) {  
		
		  HashMap<Integer,String> hm= new HashMap<Integer,String>();  
		  hm.put(1, "Red");
		  hm.put(2, "Green");
		  hm.put(3, "Black");
		  hm.put(4, "White");
		  hm.put(5, "Blue");
		  
		  /*Exercise 1. Write a Java program to associate the specified value with the specified key in a HashMap.
		  Sample output (hint use Map(<int><String>))*/
		  
		  for(Map.Entry x:hm.entrySet())
		  {  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		  //Exercise 2:Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise 1.
		  String s=(String)hm.get(3); 
		   System.out.println("Value for key 3 is: " + s);
		   
		   //Exercise 3. Write a Java program to remove all of the mappings from a map in exercise 1
		   System.out.println("The Original linked map: " + hm);
		   hm.clear();
		   System.out.println("Affter remove operation: " + hm);
		 }  

}
