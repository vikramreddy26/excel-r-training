package folder;

import java.util.*;

public class Demo30{

	public static void main(String[] args) {
		 ArrayList<Integer> araylist1 = new ArrayList<>();	    
	      araylist1.add(100);
	      araylist1.add(200);
	      araylist1.add(100);
	      araylist1.add(0);
	      araylist1.add(900);
	      araylist1.add(600);
	      System.out.println("Elements of the list: ");
	      
	      Iterator<Integer> iterate = araylist1.iterator();
	    
	      while (iterate.hasNext()) { 
	         System.out.println(iterate.next()); 
	      }
	}

}