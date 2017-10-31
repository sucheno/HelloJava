import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sampleLinkedList = new LinkedList<String>();
		List<String> sampleArrList = new ArrayList<String>();
		
		sampleLinkedList.add("LinkedList");
		sampleLinkedList.add("Suchen");
		sampleLinkedList.add(0, "Oguri");
		
		sampleArrList.add("ArrayList");
		sampleArrList.add("Suchen");
		sampleArrList.add(1,"Oguri");
		
		System.out.println(sampleArrList);
		System.out.println(sampleLinkedList);
		
		
		

	}

}
