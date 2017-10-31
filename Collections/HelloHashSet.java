import java.util.HashSet;
import java.util.Iterator;

public class HelloHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> sampleSet = new HashSet<Employee>();
		HashSet<Employee> sampleSet2 = new HashSet<Employee>(sampleSet);
		HashSet<Employee> sampleSet3 = new HashSet<Employee>(100);
		
		
		
		Employee empObj = new Employee("Suchen","675259",100);
		Employee empObj2 = new Employee("Oguri","675260",100);
		Employee empObj3 = new Employee("Avinash","675261",200);
		Employee empObj4 = new Employee("Oguri","675262",200);
		
		sampleSet.add(empObj);
		sampleSet.add(empObj);
		sampleSet.add(empObj);		
		System.out.println("Size : "+sampleSet.size());
		
		
		sampleSet.add(empObj2);
		sampleSet.add(empObj3);
		sampleSet.add(empObj3);
		sampleSet.add(empObj3);
		sampleSet.add(empObj3);
		sampleSet.add(empObj3);		
		sampleSet.add(empObj4);
		System.out.println("Size : "+sampleSet.size());
		
		sampleSet3 = sampleSet2;
		sampleSet3.clear();
		
		Iterator<Employee> iter = sampleSet.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}
