package com.bigdata;

import java.util.Arrays;
import java.util.Collections;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[] { 1, 4, 6, 3, 2, 7, 8 };
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array in sorted descending order: \n");
		for (int data : a) {
			System.out.println(data);
		}
	}

}
