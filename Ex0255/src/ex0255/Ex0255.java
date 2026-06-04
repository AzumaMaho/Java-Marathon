package ex0255;

import java.util.Scanner;

public class Ex0255 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);

		 String str = sc.nextLine();
	     String[] words = str.split(" ");
	     
	  // 文字列配列を整数配列に変換
	     int[] nums = new int[words.length];

	     for (int i = 0; i < words.length; i++) {
	         nums[i] = Integer.parseInt(words[i]);
	     }
	     
	  // 比較する2つの数値と最大公約数を格納する変数
	     int num1 = nums[0];
	     int num2 = nums[1];
	     
	     System.out.println("日 月 火 水 木 金 土");
	     System.out.println("-----------------------");
	     
	     int start = num1; // 開始曜日
	     int lastDay = num2; // 月末日
	     
	     
	  // 月初の曜日に合わせて空白を出力
	     for (int i = 0; i < start; i++) {
	    	    System.out.print("   ");
	    	}
	     
	  // 1日から月末日まで順番に表示
	     for (int day = 1; day <= lastDay; day++) {
	    	// 日付を2桁表示
	    	 System.out.printf("%02d ", day);
	    	// 土曜日まで表示したら改行
	    	 if ((start + day) % 7 == 0) {
	    		    System.out.println();
	    	 }
	     }
	     
	     System.out.println();
	     System.out.println("-----------------------");
	     
	     sc.close();
	     
	   
	}

}
