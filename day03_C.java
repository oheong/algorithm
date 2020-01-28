
public class C {
	public static void main(String[] args) {
		// 3. 팩토리얼
		// 5! == 5*4*3*2*1

		System.out.println(factorial(1));
	}

	static int factorial(int n) {
		// 종료조건
		// 실행
		// 재귀호출
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
