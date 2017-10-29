/**
 * 
 */
package com.bigdata;

import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter number:");
		a = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println("multiples of " + a + " x " + i + " = " + i * a);
		}
		input.close();
	}

}
