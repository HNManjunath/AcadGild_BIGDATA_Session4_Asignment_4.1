/**
 * 
 */
package com.bigdata;

import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
public class Program4 {

	/**
	 * @param args
	 */
	public void findOddEven(int x, int y) {

		for (int i = x; i < y; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number is: "+i);
			}
			else
			{
				System.out.println("Odd Number is: "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Program4 data = new Program4();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		a = input.nextInt();
		System.out.println("Enter 2nd number:");
		b = input.nextInt();
		data.findOddEven(a, b);

	}

}
