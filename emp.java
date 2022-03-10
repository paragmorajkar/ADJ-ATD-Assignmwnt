import java.util.*;

public class emp implements Comparable<emp>{
	private String employeeName;
	private int employeeId;
	
	emp(int id,String Name)
	{
		this.employeeId=id;
		this.employeeName=Name;
		
	}
	@Override
	public String toString() {
		return "employee [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
	}
	@Override
	public int compareTo(emp e) {
		if(employeeId>e.employeeId)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		ArrayList<emp> arraylist = new ArrayList<emp>();
		   arraylist.add(new emp(5, "Aarya"));
		   arraylist.add(new emp(3, "OM"));
		   arraylist.add(new emp(1, "Hardik"));

		   Collections.sort(arraylist); 

		   for(emp str: arraylist){
				System.out.println(str);
		   }
	}

}
