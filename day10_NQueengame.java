import java.util.Scanner;

public class NQueengame {
	static int N = 4;
	static int cnt = 0;

	static void dfs(int[][] map, int line) {
		if (line == N) {
			cnt++;
			// System.out.println(cnt);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (isPromming(map, line, i)) {
				map[line][i] = 1;
				dfs(map, line + 1);
				map[line][i] = 0;
			}

		}
	}

	private static boolean isPromming(int[][] map, int r, int c) {
//		위 검사
		for (int i = r - 1; 0 <= i; i--) {
			if (map[i][c] == 1)
				return false;
		}
//		왼쪽 대각 검사
		for (int i = r, j = c; 0 <= i && 0 <= j; i--, j--) { // for문 두개 사용하기
			if (map[i][j] == 1)
				return false;
		}

//		오른쪽 대각 검사
		for (int i = r, j = c; 0 <= i && j < N; i--, j++) {
			if (map[i][j] == 1)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test = 0; test < T; test++) {
			N = sc.nextInt();
			int[][] map = new int[N][N];
			cnt = 0;
			dfs(map, 0);
			System.out.println(String.format("#%d %d", test + 1, cnt));
		}
	}
}
