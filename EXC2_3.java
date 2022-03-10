import java.util.*;

public class EXC2_3 {
	 public static void main(String[] args) {
		  TreeSet<String> ts = new TreeSet<String>();
		  ts.add("Green");
		  ts.add("Orange");
		  ts.add("Red");
		  ts.add("Black");
		  ts.add("white");
		  System.out.println("Tree set: ");
		  System.out.println(ts);

		   // Find first element of the tree set
		    Object first_element = ts.first();
		    System.out.println("First Element is: "+first_element);
		 
		    // Find last element of the tree set
		    Object last_element = ts.last();
		    System.out.println("Last Element is: "+last_element);
		 }
}
