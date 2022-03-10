import java.util.TreeMap;

public class EXC3_4 {

	public static void main(String[] args) {
		TreeMap <String,String> tm = new TreeMap <String,String> ();

		  // Put elements to the map 
		  tm.put("C2", "Red");
		  tm.put("C1", "Green");
		  tm.put("C4", "Black");
		  tm.put("C3", "White");

		  System.out.println("Orginal TreeMap content: " + tm);
		  System.out.println("Greatest key: " + tm.firstKey());
		  System.out.println("Least key: " + tm.lastKey());

	}

}
