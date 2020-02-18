import java.util.Scanner;

public class BabyGin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] map = new int[9];
		for (int i = 0; i < str.length(); i++) {
			map[str.charAt(i) - '0']++;
		}

		int triple = 0, run = 0;
		for (int i = 0; i < 9; i++) {
			if (map[i] >= 3) {
				map[i] -= 3;
				triple++;
			}
		}
		for (int i = 0; i < 6; i++) {
			if (map[i] >= 1 && map[i + 1] <= 1 && map[i + 2] <= 1) {
				run++;
				map[i]--;
				map[i + 1]--;
				map[i + 2]--;
			}
		}
		if (triple + run <= 2)
			System.out.println("Baby-gin!");
	}
}
