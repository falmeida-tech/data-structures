package com.tutorial.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompareByAgeMain {

	public static void main(String args[]) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Vijay", 23));
		list.add(new Student(106, "Ajay", 27));
		list.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by age");

		Collections.sort(list, new CompareByAge());
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student st = (Student) iterator.next();
			System.out.println(st.getNumber() + " " + st.getName() + " " + st.getAge());
		}

	}

}
