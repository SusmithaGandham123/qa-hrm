package collections;
import java.util.*;

public class LinkedHashM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<Integer,String>();
		lhm.put(100,"mahesh");
		lhm.put(104,"revathi");
		lhm.put(103, "sushmita");
		lhm.put(102, "Lalita");
		lhm.put(101, "Ajesh");
		lhm.put(100, "Rajesh");
		lhm.put(101, "Ajay");
		
		for(Map.Entry m:lhm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
