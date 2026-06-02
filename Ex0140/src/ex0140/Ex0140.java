package ex0140;

import java.util.Scanner;

public class Ex0140 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int[] numArray = new int[3];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}

		int result = 0;
		
		if (numArray[2] == 0) {
			result = getAdd(numArray);
		} else if (numArray[2] == 1) {
			result = getSub(numArray);
		} else if (numArray[2] == 2) {
			result = getMul(numArray);
		} else {
			result = getDiv(numArray);
		}

		System.out.println("input number1 :");
		System.out.println(numArray[0]);
		System.out.println("input number2 :");
		System.out.println(numArray[1]);
		System.out.println("input command :");
		System.out.println(numArray[2]);
		System.out.println();
		System.out.println("計算結果 = " + result);
		
		sc.close();

	}

	// 足し算、引き算、掛け算、割り算のメソッド
	public static int getAdd(int[] nums) {
		return nums[0] + nums[1];
	}

	public static int getSub(int[] nums) {
		return nums[0] - nums[1];
	}

	public static int getMul(int[] nums) {
		return nums[0] * nums[1];
	}

	public static int getDiv(int[] nums) {
		return nums[0] / nums[1];
	}
}
