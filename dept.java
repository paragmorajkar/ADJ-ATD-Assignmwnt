import java.util.*;

public class dept implements Comparable<dept>{
	public int departmentId;
	public String departmentName;
	public List<emp> employees;
	dept(int departmentId,String departmentName, List<emp> employees){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.employees=employees;
		
	}
	@Override
	public int compareTo(dept d) {
		if(departmentId>d.departmentId)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}
	public static void main(String[] args)
	{
		ArrayList<emp> arraylist = new ArrayList<emp>();
		arraylist.add(new emp(5, "Aarya"));
		   arraylist.add(new emp(3, "Om"));
		   arraylist.add(new emp(1, "Hardik1"));
		Collections.sort(arraylist);
		   ArrayList<dept> arraylist2 = new ArrayList<dept>();
		   arraylist2.add(new dept(5,"Chemistry",arraylist));
		   arraylist2.add(new dept(1,"computer sci",arraylist));
		   arraylist2.add(new dept(17,"Physics",arraylist));
		   Collections.sort(arraylist2);
		   for(dept d : arraylist2)
		   {
			   System.out.println(d);
		   }
	}
}
