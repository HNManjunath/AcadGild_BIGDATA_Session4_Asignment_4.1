/**
 * 
 */
package com.bigdata;

import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
public class Program3 {

	/**
	 * @param args
	 */

	public void sum(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println("\nFirst number is:" + x);
		System.out.println("\nSecond number is:" + y);
		System.out.println("\nSum is:" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 add = new Program3();
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a = input.nextInt();
		System.out.println("Enter 2nd number:");
		b = input.nextInt();
		add.sum(a, b);
		input.close();
	}

}
