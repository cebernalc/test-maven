package com.cisco.test_maven;

/**
 * Hello world!
 *
 */
public class Sum {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int sum(int... numbers) {
		int total = 0;
		for (int i : numbers) {
			total += i;
		}
		return total;
	}
}
