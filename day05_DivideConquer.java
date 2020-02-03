import java.util.Arrays;
import java.util.Comparator;

// 분할정복
// 거듭제곱 구하기
public class DivideConquer {
	public static void main(String[] args) {
		int result1 = (int)Math.pow(5, 10); // 거듭제곱
		int result = power(5,10);
		System.out.println(result1);
		System.out.println(result);
		
		
		Integer[] arr = {1,6,9,2,4,7};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Comparator.reverseOrder()); // 배열을 Integer로 바꿔서 comparator.웅앵 하면 내림차순으로 정렬
		System.out.println(Arrays.toString(arr));
	}

	private static int power(int base, int exp) {
		//종료
		if(exp == 0) return 1;
		if(exp == 1) return base;
		//재귀 및 실행
		
		int num = power(base , exp / 2); // 함수를 한번만 호출 하면 되기때문에, 분할정복이라 볼 수 있음
		if(exp % 2 == 0) {
			return num * num;
		}
		
		else {
			return num * num * base;
		}
		
		// Array.sort =>정렬
	}
}
