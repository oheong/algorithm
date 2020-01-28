
public class C {
	public static void main(String[] args) {
		// 1 4 7
		// 2 5 8
		// 3 6 9
		int[][] arr = new int[3][3];
		int cnt = 1;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0;j < arr[i].length; j++) {
//				arr[j][i] = cnt++;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0;j < arr[i].length; j++) {
//				System.out.print(String.format("%d ", arr[i][j]));
//			}System.out.println();
//		}

		// 배열의 회전
		/*
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		 */
		cnt = 1;
		arr = new int[4][4];
		int[][] brr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}
		// 오른쪽으로 90도 회전 시키자
		for (int i = 0; i < arr.length; i++) {
			int size = arr.length - i - 1;
			for (int j = 0; j < arr[i].length; j++) {
				brr[j][size] = arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(String.format("%d\t", brr[i][j]));
			}
			System.out.println();
		}
	}
}
