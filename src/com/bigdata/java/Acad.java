/**
 * 
 */
package com.bigdata.java;

import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
public class Acad {

	/**
	 * @param args
	 */

	public void main(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println("Sum of 2 numbers is\n" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acad add = new Acad();
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("1st number\n");
		a = input.nextInt();
		System.out.println("2nd number:\n");
		b = input.nextInt();
		add.main(a, b);
		input.close();
	}

}
