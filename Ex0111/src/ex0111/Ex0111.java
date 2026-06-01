package ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int pos1 = str.indexOf("①");
		int pos2 = str.indexOf("③");
		int pos3 = str.indexOf("⑤");
		int pos4 = str.indexOf("⑦");
		int pos5 = str.indexOf("⑨");
		
		if(pos1 != -1) {
			System.out.println("許可しない文字(文字:①" + " " +  pos1 + "桁目)が含まれます");
		}
		
		if(pos2 != -1) {
			System.out.println("許可しない文字(文字:③" + " " +  pos2 + "桁目)が含まれます");
		}
		
		if(pos3 != -1) {
			System.out.println("許可しない文字(文字:⑤" + " " +  pos3 + "桁目)が含まれます");
		}
		
		if(pos4 != -1) {
			System.out.println("許可しない文字(文字:⑦" + " " +  pos4 + "桁目)が含まれます");
		}
		
		if(pos5 != -1) {
			System.out.println("許可しない文字(文字:⑨" + " " +  pos5 + "桁目)が含まれます");
		}
		
		if(pos1 == -1 && pos2 == -1 && pos3 == -1 && pos4 == -1 && pos5 == -1) {
			System.out.println("許可する文字列です");
		}
		sc.close();
	}

}
