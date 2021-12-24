package projecteuler;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaTest {

	public static void main(String[] args) {System.out.println("Start program");
		Scanner in = new Scanner(System.in);
		SortedMap<Character,List<DatabaseObject>> entries = new TreeMap<Character, List<DatabaseObject>>();
		while(in.hasNext()) {
			String input = in.nextLine();
			if(input.length()==0)
				break;
			char key = input.toUpperCase().charAt(0);
			List<DatabaseObject> l = entries.get(key);
			if(l==null)
			{
				l = new LinkedList<DatabaseObject>();
				entries.put(key, l);
			}
			
			l.add(new DatabaseObject(input));
			
		}
		for(char key:entries.keySet()) {
			System.out.println(key+":");
			for(DatabaseObject dbO:entries.get(key)) {
				System.out.println("  Name:"+dbO.name+" Email:"+dbO.email);
			}
		}
		System.out.println("End program");
	}

	
}
class DatabaseObject{
	DatabaseObject(String name) {
		this.name = name;
		this.email = name +"@javatest.com";
	}
	public String name;
	public String email;
}
