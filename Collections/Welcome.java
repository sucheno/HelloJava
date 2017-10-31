import java.util.ArrayList;
import java.util.LinkedList;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Hello Collections..\n");		
		System.out.println("You can consider the below sequence :\n");
		
		ArrayList<String> order = new ArrayList<String>();		
		order.add("First have a look at Employee class.");
		order.add("1. Iterator");
		order.add("2. ArrayList");
		order.add("3. LinkedList");	
		order.add("4. List");
		order.add("5. HashSet");
		order.add("6. LinkedHashSet");
		order.add("");
		order.add("");
		order.add("");
		order.add("");
		
		for(Object o:order) {
			System.out.println("\t"+o);
		}
		System.out.println();
		
		System.out.println("Some important points: ");		
		LinkedList<String> points = new LinkedList<String>();		
		points.add("1. Insertion order is maintained in .. <update>");
		points.add("2. Differences between ArrayList and LinkedList are: https://www.javatpoint.com/difference-between-arraylist-and-linkedlist ");
		points.add("3. List supports duplicates where as Set supports unique");
		points.add("");
		points.add("");
		points.add("");
		points.add("");
		
		for(Object o:points) {
			System.out.println("\t"+o);
		}
		System.out.println();
		
		
		System.out.println("Thanks.");
	}

}
