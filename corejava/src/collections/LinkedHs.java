package collections;
import java.util.*;
public class LinkedHs {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedHashSet<String>lhs=new LinkedHashSet<String>();
	lhs.add("susmitha");
    lhs.add("lalitha");
	lhs.add("mahesh");
	lhs.add("revathi");
	lhs.add("mahesh");
	/*for(String s:hs){
		System.out.println(s);
	}*/
	Iterator itr=lhs.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}

	}

}
