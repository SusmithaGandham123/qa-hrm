package collections;
import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("susmitha");
		hs.add("lalitha");
		hs.add("mahesh");
		hs.add("revathi");
		hs.add("mahesh");
		/*for(String s:hs){
			System.out.println(s);
		}*/
		Iterator itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
