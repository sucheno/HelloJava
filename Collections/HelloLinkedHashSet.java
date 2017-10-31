import java.util.HashSet;

public class HelloLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> sampleSet = new HashSet<Employee>();
		
		System.out.println("LinkedHashSet class extends HashSet class which implements Set interface");
		
		
		Employee empObj = new Employee("Suchen","675259",100);
		Employee empObj2 = new Employee("Oguri","675260",100);
		
		
		sampleSet.add(empObj);
		sampleSet.add(empObj2);
		
		for(Object o:sampleSet) {
			System.out.println("\t"+o);
		}
		
		
		
		

	}

}
