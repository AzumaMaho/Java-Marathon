package ex0116;

public class Ex0116 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
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

	}

}
