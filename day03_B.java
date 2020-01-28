
public class B {
	// static int N = 10;

	public static void main(String[] args) {
		// 1부터 N까지 출력하라
//		for(int i=0;i<10;i++) {
//			System.out.println(i+1);
//		}

		int num = 1;
		int N = 10;
		methodA(num, N);
		System.out.println("===============");
		methodB(N);
		System.out.println("===============");

		// 1부터 10까지의 합을 출력하는 재귀함수를 만드시오
		int sum = doSum(N, 1);
		System.out.println(sum);
		System.out.println("===============");
		int t = doSum1(N);
		System.out.println(t);
		System.out.println("===============");
	}

	static int doSum1(int num) {
		if (num == 1)
			return 1;
		return num + doSum1(num - 1);
		// 10+9+8+7....
	}

	static int doSum(int end, int num) {
		// 종료 조건 Base Case
		if (num >= end)
			return num;

		// 실행 내용
		// sum += num;

		// 재귀 호출
		return num + doSum(end, num + 1);
		// 1+2+3+4...
	}

	static void methodB(int N) {
		if (N == 0) // Basecase (종료조건)
			return;
		System.out.println(N);
		methodB(N - 1);
	}

	static void methodA(int num, int N) {
		// 종료조건 있어야 함
		if (num > N)
			return;

		System.out.println(num);

		// 자기자신 호출
		num += 1;
		methodA(num, N);
	}
}
