import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr;
		int N, M;
		for (int test = 1; test <= T; test++) {
			N = sc.nextInt();
			M = sc.nextInt(); // 이 무게 이하로 과자 골라야함
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt(); // 과자 무게 다 받아옴
			}
			int ans = -1, max = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					int temp_sum = arr[i] + arr[j];
					if (temp_sum > max && temp_sum <= M) {
						max = arr[i] + arr[j];
						ans = max;
					}
				}
			}
			System.out.println(String.format("#%d %d", test, ans));
		}
	}
}
