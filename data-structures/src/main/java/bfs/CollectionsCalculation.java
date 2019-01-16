package bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsCalculation {

	public static void main(String[] args) {
		
		Map<Double,String> location = new HashMap<Double,String>();
		
		List<Double> distances = new ArrayList<Double>();
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(3);
		list2.add(2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		list3.add(5);
		list3.add(4);
		
		List<Integer> list4 = new ArrayList<Integer>();
		
		list4.add(2);
		list4.add(-1);
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		for (List<Integer> subList: list) {
			Integer x = subList.get(0);
			Integer y = subList.get(1);
			System.out.println("x: "+x+", y:"+y);
			Double distance = Math.sqrt(x^2 + y^2);
			//System.out.println("Distance: "+distance);
			distances.add(distance);
			location.put(new Double(distance), "["+x+","+y+"]");
		}
		
		for(Map.Entry<Double, String> entry : location.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		};
		
		Collections.sort(distances);
		System.out.println("Distances");
		for (Double dist: distances) {
			System.out.println(dist);
		}
		
		for (int i = 0; i < distances.size(); i++) {
			System.out.println(location.get(distances.get(i)));
		}
	}
	
}
