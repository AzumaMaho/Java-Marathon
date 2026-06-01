package ex0113;

import java.util.Scanner;

public class Ex0113 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();

		//boolean error = false;

		/* 全角数字が含まれているかどうかをチェック
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= '０' && c <= '９') {
				error = true;
				break;
			}
		}
		

		if (error) { */
			// 全角数字を半角数字に置換
			String result = str.replace('０', '0')
					.replace('１', '1')
					.replace('２', '2')
					.replace('３', '3')
					.replace('４', '4')
					.replace('５', '5')
					.replace('６', '6')
					.replace('７', '7')
					.replace('８', '8')
					.replace('９', '9')
					.replace('．', '.'); // 全角の小数点も半角に置換
			System.out.println(result);
		
		
		sc.close();

	}

}
