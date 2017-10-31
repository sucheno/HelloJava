import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class HelloLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Employee> sampleList = new LinkedList<Employee>();
		ArrayList<Employee> sampleArrList = new ArrayList<Employee>();
		
		Employee empObj = new Employee("Suchen","675259",100);
		Employee empObj2 = new Employee("Oguri","675260",100);
		Employee empObj3 = new Employee("Avinash","675261",200);
		Employee empObj4 = new Employee("Oguri","675262",200);
		
		sampleList.add(empObj);
		sampleList.removeFirst();
		sampleList.addFirst(empObj2);	
		sampleList.addLast(empObj3);    
		sampleList.removeFirst();
			
		sampleArrList.add(empObj4);
		
		System.out.println("sampleList size is :"+sampleList.size());
		System.out.println("sampleList element is :"+sampleList.getLast());
		System.out.println("The index of 'empobj4' is: "+sampleList.lastIndexOf(empObj4));
		System.out.println("Whether sampleList has all element 'empObj4': "+sampleList.contains(empObj4)); // return -1 if not found; else returns the last found index.
		System.out.println("Whether sampleList has all elements of sampleArraylist: "+sampleList.containsAll(sampleArrList));
		
		Iterator<Employee> iter = sampleList.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
