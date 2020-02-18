import java.util.Scanner;

public class sweaSW {
	static int T, N, workY, workX, homeY, homeX, ans;
	static int[][] map;
	static int[] visited;

	static int abs(int a) {
		if (a < 0)
			return -1 * a;
		else
			return a;
	}

	static void dfs(int d, int y, int x, int distance) {
		if (d == N) {
			distance += (abs(y - homeY) + abs(x - homeX));
			if (ans > distance)
				ans = distance;
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == 0) {
				visited[i] = d + 1;
				dfs(d + 1, map[i][1], map[i][0], distance + abs(y - map[i][1]) + abs(x - map[i][0]));
				visited[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test = 0; test < T; test++) {
			N = sc.nextInt();
			map = new int[N][2];
			visited = new int[N];
			workX = sc.nextInt();
			workY = sc.nextInt();
			homeX = sc.nextInt();
			homeY = sc.nextInt();
			for (int i = 0; i < N; i++) {
				map[i][0] = sc.nextInt(); // x
				map[i][1] = sc.nextInt(); // y
			}
			ans = 2123456789;
			dfs(0, workY, workX, 0);
			System.out.println(String.format("#%d %d", test + 1, ans));
		}
	}
}
