import java.util.Scanner;

public class unionFindTest2 {
	static int N, M;
	static int[] map;

	static void setting() {
		for (int i = 0; i <= N; i++) {
			map[i] = i;
		}
	}

	static int findSet(int x) {
		if (x == map[x])
			return x;
		else
			return map[x] = findSet(map[x]);
	}

	static void union(int y, int x) {
		if (y == x)
			return;
		x = findSet(x); // 앞으로 x 쓸 일 없으니까 재활용 할 수 있음
		y = findSet(y);
		if (x == y)
			return;
		map[y] = x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test = 0; test < T; test++) {
			StringBuffer sb = new StringBuffer();
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N + 1];
			setting();
			System.out.print(String.format("#%d ", test + 1));
			for (int i = 0; i < M; i++) {
				int choice = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (choice == 0) { // b가 포함된 집합을 a가 포함된 집합으로 합쳐라
					union(findSet(b), findSet(a)); // 대장끼리 합친다
				}

				else { // 출략
					if (findSet(a) == findSet(b))
						sb.append(1);
					else
						sb.append(0);

				}
			}
			System.out.println(sb);
		}
	}
}
