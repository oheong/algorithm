import java.util.Scanner;

public class BabyGin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[12]; // if와 비교연산자는 시간 오래걸리기때문에 애초에 배열 크기 늘려줌
		for (int i = 0; i < 6; i++) {
			int temp = sc.nextInt();
			arr[temp]++;
		}

		// 솔루션 입력
		// Greedy
		// 큰 것 부터 탐색하며 최적의 방법을 찾아내는 방법
		int i = 0, run = 0, tri = 0;
//		while(i < 10) {
//			if(arr[i] >= 3) {
//				tri++;
//				arr[i] -= 3;
//				continue;
//			}
//			if(arr[i] >= 1&&arr[i+1] >= 1&&arr[i+2] >= 1) {
//				run++;
//				arr[i]--;
//				arr[i+1]--;
//				arr[i+2]--;
//			}
//			i++;
//		}
//		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] >= 3) {
				tri++;
				arr[j] -= 3;
				j--;
			}
			if (arr[j] >= 1 && arr[j + 1] >= 1 && arr[j + 2] >= 1) {
				run++;
				arr[j]--;
				arr[j + 1]--;
				arr[j + 2]--;
			}
		}

		if (run + tri == 2)
			System.out.println("Baby Gin");
		else
			System.out.println("Lose");
	}
}
