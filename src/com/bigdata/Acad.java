package com.bigdata;

public class Acad {

	public int main(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("Sum of 2 numbers are--" + sum);
		return sum;
	}

	public static void main(String[] args) {
		Acad add = new Acad();
		add.main(5, 10);

	}
}
