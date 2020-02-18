
public class Zegop {
	static long dfs(int base, int exp) {
		cnt++;
		if (exp == 0)
			return 1;
		if (exp == 1)
			return base;
		long su = dfs(base, exp / 2);
		su = su * su;
		if (exp % 2 == 1) {
			su = su * base;
		}
		return su;
	}

	static int cnt = 0;

	public static void main(String[] args) {
		int base = 2;
		int exp = 8;
//		long result = dfs(base, exp);
		long result = (long) Math.pow(base, exp);
		System.out.println(result);
		System.out.println(cnt);
	}
}
