
public class D {
	static int sum = 0;

	static void digitSum(int num) {
		if (num == 0)
			return;

		int mok = num / 10;
		int nam = num % 10;
		sum += nam;
		digitSum(mok);
		// return (num % 10) + digitSum(num / 10);
	}

	public static void main(String[] args) {
		int N = 7;
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 0; i < 5; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);

		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(arr[N - 1]);

		System.out.println(fibo(N));

		// 4. 자연수를 넣어 그 각자리의 수의 합을 반환하는 재귀함수를 만들어라
		// System.out.println(digitSum(12356));
		digitSum(12356);
		System.out.println(sum);

	}

	static int fibo(int n) {
		// 종료
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		// 실행
		// 재귀
		return fibo(n - 1) + fibo(n - 2);
	}
}
