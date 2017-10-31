import java.util.ArrayList;
import java.util.Iterator;

public class HelloIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> sampleList = new ArrayList<Employee>();		
		Employee empObj = new Employee("Suchen","675259",100);		
		sampleList.add(empObj);
		
		
		Iterator<Employee> iter = sampleList.iterator();		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

		
		
	}

}
