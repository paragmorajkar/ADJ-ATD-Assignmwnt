import java.util.*;

 class dept2 implements Comparable<dept2>{
	private int departmentId;
	private String departmentName;
	private List<Adrr> employees;
	dept2(int departmentId,String departmentName, ArrayList<Adrr> arraylist){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.employees=arraylist;
		
	}
	
	

	@Override
	public String toString() {
		return "department2 [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}

	@Override
	public int compareTo(dept2 de) {
		if(departmentId>de.departmentId)
			return 1;
		else
			return -1;
	}

	
}
public class Adrr {
	private String countryName,stateName,city;
	Adrr(String countryName,String stateName,String city,emp e)
	{
		this.countryName=countryName;
		this.stateName=stateName;
		this.city=city;
	}
	@Override
	public String toString() {
		return "address [countryName=" + countryName + ", stateName=" + stateName + ", city=" + city + "]";
	}
	public static void main(String[] args) {
	ArrayList<Adrr> arraylist = new ArrayList<Adrr>();
	ArrayList<emp> e = new ArrayList<emp>();
	
	arraylist.add(new Adrr("india", "mh", "aurangabad", new emp(5, "Sudarshan")));
	arraylist.add(new Adrr("india", "mh", "ambad", new emp(3, "Sulbha")));
	arraylist.add(new Adrr("india", "mh", "jalna", new emp(1, "krushna")));
	ArrayList<dept2> arraylist2 = new ArrayList<dept2>();
	   arraylist2.add(new dept2(5,"com",arraylist));
	   arraylist2.add(new dept2(1,"it",arraylist));
	   arraylist2.add(new dept2(17,"mca",arraylist));
	   Collections.sort(arraylist2);
	   for(dept2 d : arraylist2)
	   {
		   
		   System.out.println(d);
		   
	   }
}
}