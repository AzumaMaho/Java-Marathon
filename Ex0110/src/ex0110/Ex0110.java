package ex0110;

public class Ex0110 {

	public static void main(String[] args) {
		// TODO 自動生成された

		if (args[0].equals(args[1])) {
			System.out.println("二つの文字列は同じです");
		} else if (args[0].compareTo(args[1]) < 0) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		} else {
			System.out.println(args[1]);
			System.out.println(args[0]);
		}

	}
}
