/**
 * 
 */
package com.bigdata;

/**
 * @author MANJUNATH
 *
 */
public class Program6_MethodOverloading {

	/**
	 * @param args
	 */
	int sum;

	public void sum(int x, int y) { // Method overloading, same method with different parameters
		sum = x + y;
		System.out.println("Sum of 2 numbers: " + sum);
	}

	public void sum(int x, int y, int z) { // Method overloading, same method with different parameters
		sum = x + y + z;
		System.out.println("Sum of 3 numbers: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 3;
		Program6_MethodOverloading add = new Program6_MethodOverloading();
		add.sum(a, b); // calling sum method
		add.sum(a, b, c); // calling sum method
	}

}
