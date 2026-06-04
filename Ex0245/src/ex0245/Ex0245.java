package ex0245;

import java.util.Scanner;

public class Ex0245 {

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
	     int num1;
	     int num2;
	     int gcd = 1;
	     
	  // 大小判定
	     if (nums[0] > nums[1]) {
	    	 num2 = nums[0];
		     num1 = nums[1];
	     } else {
	    	 num1 = nums[0];
		     num2 = nums[1];
	     }
	     
	     System.out.println("input number1 :");
	     System.out.println(nums[0]);
	     System.out.println("input number2 :");
	     System.out.println(nums[1]);
	     System.out.println();
	     
	     
	  // 小さい方の数から逆順に探索し、共通の約数を探す
	     for (int i = num1; i >= 1; i-- ) {
	    	 if (num1 % i == 0 && num2 % i == 0) {
	    		 gcd = i;
	    		 break;
	    	 }
	     }
	     
	     System.out.println("最大公約数 = " + gcd);
	     
	     sc.close();

	}

}

// for (int i = Math.min(nums[0], nums[1]); i >= 1; i++)
