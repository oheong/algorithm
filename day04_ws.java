import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ws {
	static int t = -1;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int test = 0; test < TC; test++) {
			int K = sc.nextInt();
			int[] sstack = new int[K];
			t = -1;
			int num;
			for (int i = 0; i < K; i++) {
				num = sc.nextInt();
				if (num == 0) {
					pop(sstack);
				} else {
					push(sstack, num);
				}
			}
			int sum = 0;
			for (int i = 0; i <= t; i++) {
				sum += sstack[i];
			}
			System.out.println(String.format("#%d %d", test + 1, sum));
		}
	}

	static void push(int[] arr, int n) {
		t++;
		arr[t] = n;
	}

	static void pop(int[] arr) {
		t--;
	}
}
