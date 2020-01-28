import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scfile = new Scanner(System.in);
		//Scanner scfile = new Scanner(new FileInputStream("input.txt"));
		int[][] map = new int[100][100];
		int[] dy = { -1, 0, 0 }, dx = { 0, 1, -1 }; // 하, 우, 좌
		for (int T = 0; T < 10; T++) {
			int t = scfile.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = scfile.nextInt(); // map 기본 정보 받아옴
				}
			}
			int ans = 0;
			int size = map.length;
			boolean flag = false;
			for (int i = 0; i < 100; i++) {
				if (map[99][i] == 2) { // 사다리 시작
					int ty = 99, tx = i;
					while (0 <= ty) {
						if (tx + dx[1] < size && map[ty][tx + dx[1]] == 1) { // 오른쪽
							while (true) {
								if (tx + dx[1] >= size || map[ty][tx + dx[1]] == 0)
									break;
								else
									tx += dx[1];
							}
						} else if (0 <= tx + dx[2] && map[ty][tx + dx[2]] == 1) { // 왼쪽
							while (true) {
								if (tx + dx[2] < 0 || map[ty][tx + dx[2]] == 0)
									break;
								else
									tx += dx[2];
							}
						}
						// 위로 올라가
						ty += dy[0];
						ans = tx;
						// System.out.println(String.format("ty : %d tx : %d", ty, tx));
					}
				}
			}
			System.out.println(String.format("#%d %d", t, ans));
		}
	}
}
