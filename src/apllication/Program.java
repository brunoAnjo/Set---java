package apllication;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1,2,3,4,5,7,9, 10));
		
		//Union 
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
