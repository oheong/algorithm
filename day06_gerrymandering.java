import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gerrymandering {
	static int N;
	static int[][] map, visited;
	static int[] choice = new int[2];
	static int sec1, sec2, sec3, sec4, sec5;

	static void dfs(int d) {
		if (d == 2) {
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//
//				}
//			}
			System.out.println(String.format("%d %d", choice[0], choice[1]));
			return;
		}
		// 중복순열
		for (int i = 1; i < N / 2; i++) {
			choice[d] = i;
			dfs(d + 1);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("text.txt"));
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

	}
}
