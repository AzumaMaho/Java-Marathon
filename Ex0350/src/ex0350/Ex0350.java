
/*
 * ダイクストラ法は、スタート地点から各頂点までの最短距離を求めるアルゴリズム。
 * まず、スタート地点の距離を0、それ以外の頂点の距離を無限大（Integer.MAX_VALUE）で初期化する。
 * その後、まだ確定していない頂点の中から、現在わかっている距離が最も短い頂点を探し、
 * その頂点を確定する。確定した頂点から直接つながっている頂点について、
 * 「その頂点を経由した場合の距離」を計算し、現在登録されている距離より短ければ更新する。
 * この処理を全ての頂点が確定するまで繰り返すことで、スタート地点から各頂点への最短距離を求めることができる。
 * 	最短距離(次)
　　=
　　min(
  　今の距離,
  　現在の距離 + 道路代
　　)
 */

package ex0350;

public class Ex0350 {

	public static void main(String[] args) {

		// グラフの距離（つながっていない場所は0）
		int[][] graph = {
			{0, 4, 5, 0, 2, 0, 0},
			{4, 0, 6, 4, 3, 0, 0},
			{5, 6, 0, 6, 0, 0, 10},
			{0, 4, 6, 0, 6, 2, 6},
			{2, 3, 0, 6, 0, 9, 0},
			{0, 0, 0, 2, 9, 0, 3},
			{0, 0, 10, 6, 0, 3, 0}
		};

		int n = graph.length;

		// 各頂点までの最短距離
		int[] distance = new int[n];

		// 確定済みかどうか
		boolean[] fixed = new boolean[n];

		// 最初は無限大扱い
		for (int i = 0; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		// スタート地点(頂点0)
		distance[0] = 0;

		while (true) {

			int min = Integer.MAX_VALUE; //今見つかっている最小距離
			int current = -1; //その頂点番号

			// 未確定の頂点の中から最短距離の頂点を探す
			for (int i = 0; i < n; i++) {
				if (!fixed[i] && distance[i] < min) {
					min = distance[i];
					current = i;
				}
			}

			// 全て確定したら終了
			if (current == -1) {
				break;
			}

			// 頂点を確定
			fixed[current] = true;

			System.out.println(
				"頂点" + current + "確定。距離=" + distance[current]);

			// ゴール(頂点6)が確定したら終了
			if (current == 6) {
				break;
			}

			// 隣接頂点の距離を更新
			//各頂点についてここへ来る別ルートはないかを何度も比較して、最短距離を育てている
			for (int i = 0; i < n; i++) {

				if (graph[current][i] != 0 && !fixed[i]) {

					//currentを経由してiへ行った時の距離
					int newDistance =
						distance[current] + graph[current][i];

					if (newDistance < distance[i]) {
						distance[i] = newDistance;
					}
				}
			}
		}

	}
}
