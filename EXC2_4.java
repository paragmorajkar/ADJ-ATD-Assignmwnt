import java.util.*;

public class EXC2_4 {

	public static void main(String[] args) {
		
		TreeSet <Integer>ts = new TreeSet<Integer>();
		   // Add numbers in the tree
		   ts.add(10);
		   ts.add(22);
		   ts.add(36);
		   ts.add(25);
		   ts.add(16);
		   ts.add(70);
		   ts.add(82);
		   ts.add(89);
		   ts.add(14);
		   
		   System.out.println("Strictly greater than 76 : "+ts.higher(76));
		   System.out.println("Strictly greater than 31 : "+ts.higher(31));

	}

}
