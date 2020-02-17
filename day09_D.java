
public class D {
	static char[] datas = { 'A', 'B', 'C', 'D' };
	static boolean[] visited = new boolean[datas.length];

	static void dfs(int d) {
		if (d == datas.length) {
			for (int i = 0; i < datas.length; i++) {
				if (visited[i])
					System.out.print(datas[i] + " ");
			}
			System.out.println();
			return;
		}
		visited[d] = false;
		dfs(d + 1);
		visited[d] = true;
		dfs(d + 1);
	}

	static void solve() {
		int size = 1 << datas.length;
		for (int data = 0; data < size; data++) {
			for (int j = 0; j < datas.length; j++) {
				if ((data & (1 << j)) != 0) {
					System.out.print(datas[j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		dfs(0);
		solve();
	}
}
