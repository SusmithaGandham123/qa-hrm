package collections;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>ht=new HashMap<Integer,String>();
		ht.put(100,"mahesh");
		ht.put(104,"revathi");
		ht.put(103, "sushmita");
		ht.put(102, "Lalita");
		ht.put(101, "Ajesh");
		ht.put(100, "Rajesh");
		ht.put(101, "Ajay");
		
		for(Map.Entry m:ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

		

	}

}
