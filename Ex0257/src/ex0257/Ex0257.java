package ex0257;

import java.util.Scanner;

public class Ex0257 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input date1：");
		String str1 = sc.nextLine();

		System.out.println("input date2：");
		String str2 = sc.nextLine();

		// 日付1を分解
		String[] date1 = str1.split("/");
		int month1 = Integer.parseInt(date1[1]);
		int day1 = Integer.parseInt(date1[2]);

		// 日付2を分解
		String[] date2 = str2.split("/");
		int month2 = Integer.parseInt(date2[1]);
		int day2 = Integer.parseInt(date2[2]);

		// 各月の日数
		int[] days = {
			31, 28, 31, 30,
			31, 30, 31, 31,
			30, 31, 30, 31
		};

		// 日付1がその年の何日目か計算
		int totalDay1 = day1;
		for (int i = 0; i < month1 - 1; i++) {
			totalDay1 += days[i];
		}

		// 日付2がその年の何日目か計算
		int totalDay2 = day2;
		for (int i = 0; i < month2 - 1; i++) {
			totalDay2 += days[i];
		}

		// 日数差を計算
		int diff = Math.abs(totalDay1 - totalDay2); //どっちの日付が先でも日数差を正の数にする
		long seconds = diff * 86400L; //日数差に86400を掛けて秒数へ変換

		if (diff == 0) {
			System.out.println("日数の差は 0 日です");
		} else {
			System.out.println(
				    "日数の差は " + diff + " 日で " + seconds + " 秒です");
		}

		sc.close();
	}
}