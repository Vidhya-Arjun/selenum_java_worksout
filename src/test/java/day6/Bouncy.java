package day6;

import java.util.*;

public class Bouncy {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number you want to check: ");
		int num = scan.nextInt();
		if (isIncreasing(num))
			System.out.println("Increasing");
		else if (isDecreasing(num))
			System.out.println("Decreasing");
		if (!isIncreasing(num) && !isDecreasing(num))
			System.out.println("neither increasing nor decreasing");

	}

	static boolean isIncreasing(int value) {

		String s = Integer.toString(value);

		char digit;
		boolean flag = true;
		for (int i = 0; i < s.length() - 1; i++) {
			digit = s.charAt(i);

			if (digit > s.charAt(i + 1)) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	static boolean isDecreasing(int value) {
		String s1 = Integer.toString(value);
		char digit;
		boolean flag = true;
		for (int i = 0; i < s1.length() - 1; i++) {
			digit = s1.charAt(i);
			if (digit < s1.charAt(i + 1)) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}