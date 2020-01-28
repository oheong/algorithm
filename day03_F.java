
public class F {
	static int[] arr = { 1, 2, 3, 4 };

	public static void main(String[] args) {
		//methodA();
		//methodB();
		methodC();
	}

	static void print(boolean[] flag) {
		for (int i = 0; i < 4; i++) {
			if (flag[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	static void methodA() {
		boolean[] flag = new boolean[4];
		for (int i = 0; i < 2; i++) {
			if (i % 2 == 0)
				flag[0] = true;
			else
				flag[0] = false;
			for (int j = 0; j < 2; j++) {
				flag[1] = j % 2 == 0 ? true : false;
				for (int k = 0; k < 2; k++) {
					flag[2] = k % 2 == 0 ? true : false;
					for (int l = 0; l < 2; l++) {
						flag[3] = l % 2 == 0 ? true : false;
//						작업 진행하면 됨! 모든 경우의 수 다 만들어짐
						print(flag);
					}
				}
			}
		}
	}

	static void methodB() {
		boolean[] flag = new boolean[arr.length];
		powerSet(0, arr.length, flag);
	}

	static void powerSet(int d, int maxSize, boolean[] flag) {
		// 종료 조건
		if (d == maxSize) {
			// 출력해보기
			print(flag);
			return;
		}
		// 실행
		// 재귀호출
		flag[d] = false;
		powerSet(d + 1, maxSize, flag);
		flag[d] = true;
		powerSet(d + 1, maxSize, flag);
	}

	static void methodC() { // 비트마스크를 활용한 모든 경우의 수 구하기
		int size = 1 << arr.length; // 1을 4번 이동해라. => 2*2*2*2 == 16 (부분집합의 모든 갯수)
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((i & (1 << j)) != 0) {
					System.out.print(arr[j] + " ");
				}
			}
			System.out.println();
		}
	}
}
