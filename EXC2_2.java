import java.util.*;

public class EXC2_2 {
	public static void main(String[] args) {
       
    HashSet<String> h= new HashSet<String>();
  
         h.add("A");
         h.add("B");
         h.add("C");
         h.add("D");
         h.add("E");
         h.add("F");
     System.out.println("Original Hash Set: " + h);
    List<String> al = new ArrayList<String>(h);
    System.out.println("ArrayList contains: "+ al);
	}

}
