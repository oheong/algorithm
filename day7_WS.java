import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day7WS {
	static int N;
	static char[] map;

	static int check(boolean[] visited) {
		for (int i = 1; i <= N; i++) {
			if (visited[i] == false)
				return -1;
		}
		return 0;
	}

	static void inOrder(char[] map, int index) {
		if (N < index)
			return;
		if (map[index] == '\u0000')
			return;
		inOrder(map, index * 2);
		System.out.print(String.format("%c", map[index])); // visited
		inOrder(map, index * 2 + 1);
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in);
		for (int test = 0; test < 10; test++) {
			N = sc.nextInt();
			map = new char[N + 1];
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				String str = sc.nextLine();
				char c = str.charAt(1);
				map[temp] = c;
			}

			// 중위순회 돌기 하,,
			System.out.print(String.format("#%d ", test + 1));
			inOrder(map, 1);
			System.out.println();
		}
	}
}
