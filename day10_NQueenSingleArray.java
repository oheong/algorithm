import java.util.Scanner;

public class NQueenSingleArray {
	static int N;
	static int count = 0;
	static int[] map;

	static void dfs(int d) {
		if (d == N) {
//			for (int i = 0; i < N; i++)
//				System.out.print(map[i] + " ");
//			System.out.println();
			count++;
			return;
		}
		for (int i = 0; i < N; i++) {
			map[d] = i;
			if (isPromming(map, d))
				dfs(d + 1);
			else
				map[d] = -1;
		}
	}

	static int abs(int a) {
		if (a < 0)
			return -1 * a;
		else
			return a;
	}

	private static boolean isPromming(int[] map, int line) {
		for (int i = 0; i < line; i++) {
			if (map[i] == map[line])
				return false;
			if (abs(map[line] - map[i]) == abs(line - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if (N <= 3) {
			System.out.println(1);
			return;
		}
		map = new int[N];
		dfs(0);

		System.out.println(count);
	}
}
