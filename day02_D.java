
public class D {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		// 특정한 좌표의 상, 하, 좌, 우 값 출력
		int ty, tx;
		int[] dy = { 0, 0, 1, -1 };
		int[] dx = { 1, -1, 0, 0 };

		int ans = 0;

		for (ty = 0; ty < arr.length; ty++) {
			for (tx = 0; tx < arr.length; tx++) {
				for (int i = 0; i < 4; i++) {
					int ny = ty + dy[i];
					int nx = tx + dx[i];
					if (0 <= ny && ny < arr.length && 0 <= nx && nx < arr.length) {
						ans += Math.abs(arr[ty][tx] - arr[ny][nx]);
					}
				}
			}
		}
		System.out.println(ans);
	}
}