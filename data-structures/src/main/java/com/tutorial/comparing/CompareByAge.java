package com.tutorial.comparing;

import java.util.*;

public class CompareByAge implements Comparator<Student> {
	
	public int compare(Student student1, Student student2) {
		
		if (student1.getAge() == student2.getAge())
			return 0;
		else if (student1.getAge() > student2.getAge())
			return 1;
		else
			return -1;
	}
}
