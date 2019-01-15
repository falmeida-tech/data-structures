package com.tutorial.comparing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompareByAgeStreams {
	
	public static void main(String args[]) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Vijay", 23));
		list.add(new Student(2, "Ajay", 27));
		list.add(new Student(3, "Jai", 21));
		list.add(new Student(4, "Carlos", 20));
		list.add(new Student(5, "John", 45));
		list.add(new Student(6, "Ian", 24));
		list.add(new Student(7, "Rachel", 28));
		list.add(new Student(8, "Daniel", 35));
		list.add(new Student(9, "Fabio", 40));
		
		System.out.println("Sorting by age");
		
		list.stream().sorted((student1,student2) -> {
			if (student1.getAge() == student2.getAge())
				return 0;
			else if (student1.getAge() > student2.getAge())
				return 1;
			else
				return -1;
		});
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student st = (Student) iterator.next();
			System.out.println(st.getNumber() + " " + st.getName() + " " + st.getAge());
		}

	}

}
