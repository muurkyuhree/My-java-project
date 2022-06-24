package JavaColection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringSaka = new ArrayList<String>();
		stringSaka.add("Jan");
		stringSaka.add("Feb");
		stringSaka.add("Mar");
		stringSaka.add("Apr");
		stringSaka.add("May");
		stringSaka.add("Jun");
		stringSaka.add("Jul");
		stringSaka.add("Aug");
		stringSaka.add("Sep");
		stringSaka.add("Oct");
		stringSaka.add("Nov");
		stringSaka.add("Dec");

		Iterator<String> it = stringSaka.iterator();
		while(it.hasNext()){
			System.out.println("My String Iteration: " +it.next());
		}
	}

}
