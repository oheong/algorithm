
public class G {

	public static void main(String[] args) {
		int[][] data = new int[8][8];
		boolean[] visited = new boolean[8];

		data[1][2] = 1;
		data[2][1] = 1;

		data[3][1] = 1;
		data[1][3] = 1;

		data[2][4] = 1;
		data[4][2] = 1;

		data[2][5] = 1;
		data[5][2] = 1;

		data[3][5] = 1;
		data[5][3] = 1;

		data[4][6] = 1;
		data[6][4] = 1;

		data[5][6] = 1;
		data[6][5] = 1;

		data[7][6] = 1;
		data[6][7] = 1;

		dfs(data, visited, 1);

	}

	static char[] chars = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

	static void dfs(int[][] data, boolean[] visited, int idx) {
		// 종료조건
		// 할 일
		System.out.print(chars[idx] + " ");
		visited[idx] = true;
		// 재귀 호출
		for (int i = 1; i < data.length; i++) {
			if (!visited[i] && data[idx][i] == 1) {
				dfs(data, visited, i);
			}
		}
	}
}
