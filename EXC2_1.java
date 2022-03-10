import java.util.*;

public class EXC2_1 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		  
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);
        s1.add(7);
        s1.add(8);
        s1.add(9);
        s1.add(10);
        
        System.out.println("Set before remove operation : " + s1);
        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(4);
        s2.add(9);
        s2.add(10);
        s1.removeAll(s2);
        System.out.println("Set after remove operation : "
                           + s1);

	}

}
