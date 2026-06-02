package ex0130;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0130 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int[] numArray = new int[3];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		int max = getMax(numArray);

		System.out.print("最大値 = " + max + " ");

		double avg = getAvg(numArray);

		System.out.print("平均値 = " + avg + " ");

		int median = getMedian(numArray);

		System.out.print("中央値 = " + median);

		sc.close();
	}

	// 最大値を求めるメソッド
	public static int getMax(int[] nums) {
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	// 平均値を求めるメソッド
	public static double getAvg(int[] nums) {

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		double avg = (double) sum / nums.length;
		return Math.round(avg * 100.0) / 100.0; // 小数点以下2桁で四捨五入
	}

	// 中央値を求めるメソッド
	public static int getMedian(int[] nums) {

		int[] copy = nums.clone();
		Arrays.sort(copy);

		return copy[copy.length / 2];
	}
}