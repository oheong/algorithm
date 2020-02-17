import java.util.Arrays;
import java.util.Scanner;

public class b10974 {
	static int N, r;
	static int[] map = new int[8];
	static boolean[] visited = new boolean[8];

	static void dfs(int d) {
		if (d == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(map[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				map[d] = i + 1; // 여기 조심 항상 헷갈림
				dfs(d + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		dfs(0);
	}
}
