package apllication;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Televisao");
		set.add("Notebook");
		set.add("Tablet");
		
		
		set.removeIf(x -> x.charAt(2) == 't');
		
		if(set.contains("Tablet") == true) {
			System.out.println("Ele existe");
		}
		
		for(String p : set) {
			System.out.println(p);
		}
	}

}
