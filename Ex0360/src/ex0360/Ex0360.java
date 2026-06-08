package ex0360;

import java.util.Scanner;

/**
 * オセロゲーム（8×8盤面）
 *
 * ・黒（●）が先手、白（○）が後手で交互に打つ
 * ・打てる場所がない場合は「9」を入力してパス
 * ・両者ともパスになったらゲーム終了
 */
public class Ex0360 {
 
    // 盤面のサイズ
    private static final int SIZE = 8;
 
    // 盤面の状態を表す定数
    private static final int EMPTY = 0;  // 空き
    private static final int BLACK = 1;  // 黒（●）
    private static final int WHITE = 2;  // 白（○）
 
    // 8方向（上、右上、右、右下、下、左下、左、左上）
    private static final int[] DR = {-1, -1,  0,  1, 1,  1,  0, -1}; //行の変化量
    private static final int[] DC = { 0,  1,  1,  1, 0, -1, -1, -1}; //列の変化量
 
    // 盤面
    private static int[][] board = new int[SIZE + 1][SIZE + 1];
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 盤面初期化
        initBoard();
 
        // 最初の盤面を表示
        printBoard();
 
        int currentColor = BLACK; // 黒が先手
        int passCount = 0;        // 連続パス回数（2になったら終了）
 
        while (true) {
            // 石の数を表示
            printScore();
 
            // 手番のプレイヤー名
            String playerName = (currentColor == BLACK) ? "黒" : "白";
 
            System.out.print(playerName + "の手(行、列)　> ");
            int row = sc.nextInt();
 
            // パスの場合
            if (row == 9) {
                System.out.println(playerName + "はパスします。");
                passCount++;
                // 両者連続パス → ゲーム終了
                if (passCount >= 2) {
                    break;
                }
                // 手番交代
                currentColor = (currentColor == BLACK) ? WHITE : BLACK;
                continue;
            }
 
            int col = sc.nextInt();
            passCount = 0; // パスカウントリセット
 
            // 入力値の範囲チェック
            if (row < 1 || row > SIZE || col < 1 || col > SIZE) {
                System.out.println("1〜8の範囲で入力してください。");
                continue;
            }
 
            // 置けるかチェック
            if (!canPlace(board, row, col, currentColor)) {
                System.out.println("そこには置けません。");
                continue;
            }
 
            // 石を置いてひっくり返す
            place(board, row, col, currentColor);
 
            // 盤面を表示
            printBoard();
 
            // 手番交代
            currentColor = (currentColor == BLACK) ? WHITE : BLACK;
        }
 
        // ゲーム終了
        System.out.println("\nゲーム終了！");
        printScore();
        printResult();
 
        sc.close();
    }
 
    // ──────────────────────────────────────────
    // 盤面初期化
    // ──────────────────────────────────────────
 
    /**
     * 盤面を初期状態にセットする
     * 中央4マスに黒白を交互に配置する
     */
    private static void initBoard() {
        // 全マスを空きにする
        for (int r = 1; r <= SIZE; r++) {
            for (int c = 1; c <= SIZE; c++) {
                board[r][c] = EMPTY;
            }
        }
        // 初期配置（中央4マス）
        board[4][4] = WHITE;
        board[4][5] = BLACK;
        board[5][4] = BLACK;
        board[5][5] = WHITE;
    }
 
    // ──────────────────────────────────────────
    // 盤面表示
    // ──────────────────────────────────────────
 
    /**
     * 現在の盤面をコンソールに表示する
     */
    private static void printBoard() {
        System.out.println();
        // 列番号ヘッダー
        System.out.print("  ");
        for (int c = 1; c <= SIZE; c++) {
            System.out.print(" " + c);
        }
        System.out.println();
 
        // 各行を表示
        for (int r = 1; r <= SIZE; r++) {
            System.out.print(r + " ");
            for (int c = 1; c <= SIZE; c++) {
                if (board[r][c] == BLACK) {
                    System.out.print("●");
                } else if (board[r][c] == WHITE) {
                    System.out.print("○");
                } else {
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }
 
    /**
     * 黒と白の石の数を表示する
     */
    private static void printScore() {
        int black = 0, white = 0;
        for (int r = 1; r <= SIZE; r++) {
            for (int c = 1; c <= SIZE; c++) {
                if (board[r][c] == BLACK) black++;
                if (board[r][c] == WHITE) white++;
            }
        }
        System.out.println("●: " + black + "　○: " + white);
    }
 
    /**
     * 最終結果（勝敗）を表示する
     */
    private static void printResult() {
        int black = 0, white = 0;
        for (int r = 1; r <= SIZE; r++) {
            for (int c = 1; c <= SIZE; c++) {
                if (board[r][c] == BLACK) black++;
                if (board[r][c] == WHITE) white++;
            }
        }
        if (black > white) {
            System.out.println("黒（●）の勝ち！");
        } else if (white > black) {
            System.out.println("白（○）の勝ち！");
        } else {
            System.out.println("引き分け！");
        }
    }
 
    // ──────────────────────────────────────────
    // 石を置く処理
    // ──────────────────────────────────────────
 
    /**
     * 指定した位置に石を置けるか判定する
     *
     * @param board 盤面
     * @param row   行（1〜8）
     * @param col   列（1〜8）
     * @param color 置く石の色
     * @return 置ける場合true
     */
    private static boolean canPlace(int[][] board, int row, int col, int color) {
        // すでに石がある場合は置けない
        if (board[row][col] != EMPTY) {
            return false;
        }
        // 8方向のいずれかでひっくり返せる石があるか確認
        for (int d = 0; d < 8; d++) {
            if (countFlip(board, row, col, color, DR[d], DC[d]) > 0) {
                return true;
            }
        }
        return false;
    }
 
    /**
     * 指定した位置に石を置き、ひっくり返す
     *
     * @param board 盤面
     * @param row   行（1〜8）
     * @param col   列（1〜8）
     * @param color 置く石の色
     */
    private static void place(int[][] board, int row, int col, int color) {
        // 石を置く
        board[row][col] = color;
 
        // 8方向それぞれひっくり返す
        for (int d = 0; d < 8; d++) {
            int flipCount = countFlip(board, row, col, color, DR[d], DC[d]);
            if (flipCount > 0) {
                // その方向にflipCount個ひっくり返す
                int r = row + DR[d];
                int c = col + DC[d];
                for (int i = 0; i < flipCount; i++) {
                    board[r][c] = color;
                    r += DR[d];
                    c += DC[d];
                }
            }
        }
    }
 
    /**
     * 指定した方向にひっくり返せる石の数を返す
     *
     * ひっくり返せる条件:
     * ・隣から相手の石が続いて
     * ・その先に自分の石がある
     *
     * @param board 盤面
     * @param row   行
     * @param col   列
     * @param color 置く石の色
     * @param dr    行方向の増分
     * @param dc    列方向の増分
     * @return ひっくり返せる石の数（0なら返せない）
     */
    private static int countFlip(int[][] board, int row, int col, int color, int dr, int dc) {
        int opponent = (color == BLACK) ? WHITE : BLACK; // 相手の色
        int count = 0;
        int r = row + dr;
        int c = col + dc;
 
        // 相手の石が続く間カウント
        while (r >= 1 && r <= SIZE && c >= 1 && c <= SIZE && board[r][c] == opponent) {
            count++;
            r += dr;
            c += dc;
        }
 
        // その先に自分の石があればひっくり返せる、なければ0を返す
        if (count > 0 && r >= 1 && r <= SIZE && c >= 1 && c <= SIZE && board[r][c] == color) {
            return count;
        }
        return 0;
    }
}