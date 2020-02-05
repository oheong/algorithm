
public class F {
	static int[] dp = new int[100];

	public static void main(String[] args) {
		int num = 7;
		dp[0] = 0;
		dp[1] = 1;
		int result = fibodp(num);
		System.out.println(result);
//		int result = fibodp(num);
//		System.out.println(result);
	}

	static int fibodp(int n) {
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
//	static int fibo(int n) {
//		if (n == 0)
//			return 0;
//		if (n == 1)
//			return 1;
//		
//		if (dp[n] == 0)
//			dp[n] = fibo(n - 1) + fibo(n - 2);
//		return dp[n];
//	}
}
