import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testDFS {
	static int[][] data;
	static boolean[] visited;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		data = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			data[a][b] = 1;
			data[b][a] = 1;
		}
//		data[1][2] = 1;
//		data[2][1] = 1;
//
//		data[1][3] = 1;
//		data[3][1] = 1;
//
//		data[2][4] = 1;
//		data[4][2] = 1;
//
//		data[2][5] = 1;
//		data[5][2] = 1;
//
//		data[3][7] = 1;
//		data[7][3] = 1;
//
//		data[4][6] = 1;
//		data[6][4] = 1;
//
//		data[5][6] = 1;
//		data[6][5] = 1;
//
//		data[7][6] = 1;
//		data[6][7] = 1;

		dfs(1);

	}

	static void dfs(int d) {
		System.out.print(String.format("%d ", d));
		visited[d] = true;
		// 현재 들어온 상태에서 나는 들어왔다는것을 표시해 주고 시작해야함.
		for (int i = 1; i < data.length; i++) {
			if (!visited[i] && data[d][i] == 1) {
				dfs(i);
			}
		}
	}

}
