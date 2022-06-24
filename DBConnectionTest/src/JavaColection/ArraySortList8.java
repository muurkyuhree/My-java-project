package JavaColection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySortList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an arrayList
		List<Integer> sl = new ArrayList<Integer>();
		
		sl.add(10);
		sl.add(9);
		sl.add(8);
		sl.add(7);
		sl.add(6);
		sl.add(5);
		sl.add(4);
		sl.add(3);
		sl.add(2);
		sl.add(1);
		
		System.out.println("List before sorting: " +sl);
		
		//Sorting list
		Collections.sort(sl);
		System.out.println("Sorted List: " +sl);
	}

}
