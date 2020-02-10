import java.util.Scanner;

public class day07_WS3 {
	static int N;
	static char[][] map;
	static int[] by = { -1, -1, -1, 0, 0, 0, 1, 1, 1 }, bx = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test = 0; test < T; test++) {
			N = sc.nextInt();
			map = new char[N + 2][N + 2];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					String s = sc.next();
					map[i][j] = s.charAt(0);
				}
			}

			int max = 0;
			int[][] cnt = new int[N + 1][N + 1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					int count = 0;
					for (int l = 0; l < 9; l++) {
						if (map[i + by[l]][j + bx[l]] == 'W')
							count++;
					}

					if (map[i][j] == 'W' && 1 < count)
						count--;
					else if (map[i][j] == 'W' && count == 1)
						count = 1;
					if (max < count)
						max = count;
				}
			}
			System.out.println(String.format("#%d %d", test + 1, max));
		}
	}
}
