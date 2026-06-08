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
			for (int i = 0; i < n; i++) {

				if (graph[current][i] != 0 && !fixed[i]) {

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