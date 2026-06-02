package ex0117;

public class Ex0117 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int e_score = Integer.parseInt(args[0]);
		int m_score = Integer.parseInt(args[1]);

		if (e_score >= 80) {
			if (m_score >= 80) {
				System.out.println("合格");
			} else {
				System.out.println("再試験");
			}

		} else if (e_score < 80) {
			if (m_score >= 80) {
				System.out.println("再試験");
			} else {
				System.out.println("留年");
			}
		}

	}

}
