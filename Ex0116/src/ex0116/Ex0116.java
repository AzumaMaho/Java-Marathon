package ex0116;

import java.util.Scanner;

public class Ex0116 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		 String str = sc.nextLine();
	     String[] words = str.split(" ");
	     
	     int[] nums = new int[words.length];

	     for (int i = 0; i < words.length; i++) {
	         nums[i] = Integer.parseInt(words[i]);
	     }

		int num1 = nums[0];
		int num2 = nums[1];

		if (num1 % 2 == 0) {
			if (num2 % 2 == 0) {
				System.out.println("2つの値ともに偶数です");
			} else {
				System.out.println("i1は偶数です。i2は奇数です。");
			}

		} else if (num1 % 2 == 1) {
			if (num2 % 2 == 0) {
				System.out.println("i1は奇数です。i2は偶数です。");
			} else {
				System.out.println("2つの値ともに奇数です");
			}
		}
		
		sc.close();

	}

}
