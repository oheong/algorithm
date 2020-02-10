import java.util.Scanner;

public class day07WS2 {
	static int N, B;
	static int[][] map;

	static class WHERE {
		int y;
		int x;
	}

	static int[] by = { 1, 2, -1, -2, 0, 0, 0, 0 }, bx = { 0, 0, 0, 0, 1, 2, -1, -2 };

	static int init() {
		int max = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (max < map[i][j])
					max = map[i][j];
				map[i][j] = 0;
			}
		}
		return max;
	}

	static void move(int y, int x) {
		map[y][x]++;
		for (int i = 0; i < 8; i++) {
			int ny = y + by[i];
			int nx = x + bx[i];
			if (ny < 1 || N < ny || nx < 1 || N < nx)
				continue;
			map[ny][nx]++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test = 0; test < T; test++) {
			N = sc.nextInt();
			B = sc.nextInt();
			map = new int[N + 2][N + 2];
			WHERE[] where = new WHERE[B + 2];
			for (int i = 0; i < B; i++) {
				WHERE w = new WHERE();
				w.y = sc.nextInt();
				w.x = sc.nextInt();
				where[i] = w;
			}

			for (int i = 0; i < B; i++) {
				move(where[i].y, where[i].x);
			}
			System.out.println(String.format("#%d %d", test + 1, init()));
		}
	}
}
