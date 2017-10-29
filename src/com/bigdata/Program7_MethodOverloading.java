/**
 * 
 */
package com.bigdata;

/**
 * we can overload the method with same return type
 *
 */
public class Program7_MethodOverloading {

	/**
	 * @param args
	 */
	int sum;

	public int sum(int x, int y) { // Method overloading, same method with different parameters
		sum = x + y;
		System.out.println("Sum of 2 numbers: " + sum);
		return sum; // we can overload method with same return type
	}

	public int sum(int x, int y, int z) { // Method overloading, same method with different parameters
		sum = x + y + z;
		System.out.println("Sum of 3 numbers: " + sum);
		return sum; // we can overload method with same return type
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 3;
		Program7_MethodOverloading add = new Program7_MethodOverloading();
		add.sum(a, b); // calling sum method
		add.sum(a, b, c); // calling sum method
	}

}
