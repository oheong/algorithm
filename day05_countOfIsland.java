import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class countOfIsland {
	static int W, H;
	static int[] by = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] bx = { 0, 1, 1, 1, 0, -1, -1, -1 };

	static class Q {
		int y;
		int x;
	}

	static void bfs(int[][] map, int[][] visited, int y, int x) {
		Queue<Q> q = new LinkedList<Q>();

		Q t = new Q();
		t.y = y;
		t.x = x;
		q.add(t);
		visited[y][x] = 1;
		while (!q.isEmpty()) {
			int ty = q.peek().y;
			int tx = q.peek().x;
			q.remove();
			for (int i = 0; i < 8; i++) {
				int ny = ty + by[i];
				int nx = tx + bx[i];
				if (0 <= ny && ny < H && 0 <= nx && nx < W && map[ny][nx] == 1 && visited[ny][nx] == 0) {
					visited[ny][nx] = 1;
					Q tt = new Q();
					tt.y = ny;
					tt.x = nx;
					q.add(tt);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			W = sc.nextInt(); // 너비
			H = sc.nextInt(); // 높이
			if (W == 0 && H == 0)
				break;
			int[][] map = new int[H][W];
			int[][] visited = new int[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == 1 && visited[i][j] == 0) {
						bfs(map, visited, i, j);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
