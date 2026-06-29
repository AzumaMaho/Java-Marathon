package ex077D;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex077D {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // 割る数（最終的にこの数の倍数を作りたい）
	        int N = sc.nextInt();

	        // dist[i] = 「余りiになる数」の中で、桁和の最小値
	        //余り0になる数（＝Nの倍数）の中で、一番桁和が小さいものが答え
	        int[] dist = new int[N];

	        // 最初はどの余りにも到達していないので∞で初期化
	        Arrays.fill(dist, Integer.MAX_VALUE);

	        // これから調べる余りを入れておく箱
	        Deque<Integer> deque = new ArrayDeque<>();

	        // スタートは「1」
	        // 1 % N の余りから始まり、桁和は1
	        dist[1 % N] = 1;

	        // 最初に調べる余りをdequeへ入れる
	        deque.addFirst(1 % N);

	        // 調べる余りがなくなるまで繰り返す
	        while (!deque.isEmpty()) {

	            // 先頭の余りを取り出す
	            int now = deque.pollFirst();

	            // --------------------------
	            // ① 今の数の末尾に「0」を付ける
	            // 例：1 → 10 → 100
	            // 桁和は変わらないのでコストは0
	            // --------------------------
	            int next = (now * 10) % N;

	            // 今までより小さい桁和で行けるなら更新
	            if (dist[next] > dist[now]) {

	                // 最小桁和を更新
	                dist[next] = dist[now];

	                // コスト0なので優先して調べたい
	                deque.addFirst(next);
	            }

	            // --------------------------
	            // ② 今の数に「1」を足す
	            // 桁和は1増えるのでコストは1
	            // --------------------------
	            next = (now + 1) % N;

	            // 今までより小さい桁和で行けるなら更新
	            if (dist[next] > dist[now] + 1) {

	                // 桁和を1増やして更新
	                dist[next] = dist[now] + 1;

	                // コスト1なので後ろへ入れる
	                deque.addLast(next);
	            }
	        }

	        // 余り0 = Nの倍数
	        // その最小桁和を出力
	        System.out.println(dist[0]);

	        sc.close();
	    
	}
	

}
