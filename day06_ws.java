import java.util.Arrays;
import java.util.Scanner;

public class ws {
	static int TC;
	static int[] dg = new int[9];
	static int[] iy_have = new int[9];
	static int[] visited = new int[9];
	static int[] iy = new int[9];
	static int[] card = new int[19];
	static int win_dg, lose_dg;

	static void init() {
		win_dg = 0;
		lose_dg = 0;
		for (int i = 0; i < 19; i++) {
			card[i] = 0;
		}
	}

	static void dfs(int d) {
		if (d == 9) {
//			for(int i=0;i<9;i++)System.out.print(String.format("%d ", iy[i]));
//			System.out.println();
			int D = 0, I = 0;
			for (int i = 0; i < 9; i++) {
				if (dg[i] > iy[i]) {
					D += dg[i];
					D += iy[i];
				}

				else if (dg[i] < iy[i]) {
					I += dg[i];
					I += iy[i];
				}
			}

			if (D < I)
				lose_dg++;
			else if (D > I)
				win_dg++;
			return;
		}
		for (int i = 0; i < 9; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				iy[d] = iy_have[i];
				dfs(d + 1);
				visited[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TC = sc.nextInt();
		for (int test = 1; test <= TC; test++) {
			for (int i = 0; i < 9; i++) {
				dg[i] = sc.nextInt();
				card[dg[i]] = 1;
			}
			int cnt = 0;
			for (int i = 1; i <= 18; i++) {
				if (card[i] == 0)
					iy_have[cnt++] = i;
			}
			dfs(0);
			System.out.println(String.format("#%d %d %d", test, win_dg, lose_dg));
			init();
		}
	}
}
