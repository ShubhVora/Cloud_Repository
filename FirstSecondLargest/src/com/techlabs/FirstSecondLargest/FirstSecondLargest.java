package com.techlabs.FirstSecondLargest;

public class FirstSecondLargest {
	public static void main(String args[]) {
		int First = 0, Second = 0;
		int number[] = { 2, 4, 7, 24, 12, 79, 46 };
		for (int i = 0; i < number.length; i++) {
			if (First < number[i]) {
				Second = First;
				First = number[i];

			}
			if (Second < number[i] && number[i] < First) {
				Second = number[i];
			}
		}

		System.out.println("First Largest Number:" + First + "\nSecond Largest Number:" + Second);
	}

}
