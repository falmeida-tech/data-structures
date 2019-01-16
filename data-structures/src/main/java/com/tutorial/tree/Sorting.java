package com.tutorial.tree;

public class Sorting {

	public static void main(String[] args) {
		
		int[] A = new int[]{5,3,2,4,1,6,7,8,9,0};
		
		printArray(A);
		sorting(A);
		System.out.println();
		printArray(A);
		
	}
	
	public static void sorting(int[] A) {
		int minIndex = 0;
		int tmp = 0;
		for (int i = 0; i < A.length-2; i++) {
			minIndex = i;
			for (int j = i+1; j < A.length-1; j++) {
				if(A[j]<A[minIndex]) {
					minIndex = j;
				}
			}
			tmp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = tmp;
		}
	}
	
	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if(i!=A.length-1) {
				System.out.print(A[i]+";");
			}else {
				System.out.print(A[i]);
			}
			
		}
	}
	
}
