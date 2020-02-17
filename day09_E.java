import java.util.Arrays;

public class E {
	static char[] an;
	static char[] tr;
	static int N = 5;
	static int R = 3;

	static void combi(int n, int r) {
		// 종료조건
		if (r == 0) {
			System.out.println(Arrays.toString(tr));
			return;
		}
		if (r > n)
			return;
		tr[r - 1] = an[n - 1];
		combi(n - 1, r - 1);
		combi(n - 1, r);
	}

	public static void main(String[] args) {
		an = new char[] { 'A', 'B', 'C', 'D', 'E' };
		tr = new char[R];
		combi(N, R);
	}
}
