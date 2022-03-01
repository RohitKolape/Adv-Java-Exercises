package arraylist_linkedlist_exercises;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		
		LinkedList<String> l_list = new LinkedList<String>();
		   
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          
		     System.out.println("Original linked list:" + l_list);    
		   
		    l_list.addFirst("Pink");
		 
		    l_list.addLast("Blue");
		    
		     System.out.println("Final linked list:" + l_list); 
		
	}

}
