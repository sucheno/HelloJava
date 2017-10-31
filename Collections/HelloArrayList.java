import java.util.ArrayList;
import java.util.Iterator;

//Suchen Oguri

public class HelloArrayList {

	public static void main(String args[])
	{
		
		ArrayList<Employee> sampleList = new ArrayList<Employee>();
		ArrayList<Employee> sampleList2 = new ArrayList<Employee>();
		ArrayList<Employee> sampleList3 = new ArrayList<Employee>(sampleList2);		
		ArrayList<Employee> sampleList4 = new ArrayList<Employee>(100);
		
		
		
		Employee empObj = new Employee("Suchen","675259",100);
		Employee empObj1 = new Employee("Oguri","675260",100);
		Employee empObj3 = new Employee("Avinash","675261",200);	
		Employee empObj4 = new Employee("Oguri","675262",200);
		
		sampleList.add(empObj);
		sampleList.add(empObj1);		
		sampleList2.add(empObj1);
		sampleList2.add(empObj3);		
		sampleList2.remove(empObj3);		
		sampleList.removeAll(sampleList2);  // only elements which are matching with elements of sampleList2 will be removed from sampleList
		sampleList.retainAll(sampleList2);  // only elements which are matching with elements of sampleList2 will be kept in sampleList
		
		sampleList4 = sampleList3;
		sampleList3.clear();
		sampleList4.trimToSize();
		
		System.out.println("ArratyList size is :"+sampleList.size());
		
		System.out.println("Whether sampleList is empty:"+sampleList.isEmpty());
		System.out.println("Whether list1 has all element 'empObj4': "+sampleList.contains(empObj4));
		System.out.println("Whether list1 has all elements of list2: "+sampleList.containsAll(sampleList2));
		
		
		Iterator<Employee> iter = sampleList.iterator();		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}		
		
	}
	 
}


