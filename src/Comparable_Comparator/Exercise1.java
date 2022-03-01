package Comparable_Comparator;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<>();
		 
			Scanner sc = new Scanner(System.in);
			int rounds = sc.nextInt();
			for(int i=0; i<rounds;i++) {
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter the name: ");
			String name = sc.next();
			
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			
			emps.add(new Employee(id, name, age));
			}
		  
		 
		  System.out.println("Before sorting custom list of employees : ");
		  Iterator<Employee> it = emps.iterator();
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  
		  
		  Collections.sort(emps);
		  System.out.println();
		  System.out.println("After sorting custom list of employees in natural order: ");
		  it = emps.iterator();
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		sc.close();
	}

}
