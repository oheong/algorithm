
public class B {
	public static void main(String[] args) {
		// 교환 Swap

		int a, b;
		a = 2;
		b = 3;
		System.out.println(String.format("a: %d b: %d", a, b));

		// 교환
		int temp = a;
		a = b;
		b = temp;
		System.out.println(String.format("a: %d b: %d", a, b));

		// 로테이션 알고리즘
		int[] arr = { 4, 2, 7, 8, 1 }; // (new int []{4,2,7,8,1}; => new int[] 생략한거임
		/*
		 * 혹은 int[] arr; arr = new int[]{웅앵};
		 */
		/*
		 * // 이거 엄청 빠름 for(int su : arr){ System.out.println(su); }
		 */
		temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = arr[2];
//		arr[2] = arr[3];
//		arr[3] = arr[4];
		int size = arr.length - 1;
		for (int i = 0; i < size; i++)
			arr[i] = arr[i + 1];
		arr[4] = temp;
		for (int su : arr) {
			System.out.println(su);
		}
		System.out.println();

		// 최대값 구하기
		arr = new int[] { 4, 3, 6, 8, 9 };
		int max = -2123456789; // Integer.MIN_VALUE
		// int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);

		// 두 수 중에서 큰 값을 구하여 출력하라
		int x = 10;
		int y = 20;
		max = Integer.MIN_VALUE;
		max = Math.max(max, x);
		max = Math.max(max, y);
//		if(x < y) max = y;
//		else max = x; 
		System.out.println(max); // 가공 처리 후 출력
	}
}
