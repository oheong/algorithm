import java.util.Arrays;

public class BinarySearchTest {
	static int methodA(int[] arr, int key) {
		int idx = -1;
		int start = 0;
		int end = arr.length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				// return mid;
				idx = mid;
				break;
			} else if (arr[mid] < key)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return idx;
	}

	static int methodB(int[] arr, int key, int start, int end) {
		// 종료
		if (start > end)
			return -1;
		// 실행 및 재귀호출
		int mid = (start + end) / 2;
		if (arr[mid] == key)
			return mid;
		else if (arr[mid] < key)
			return methodB(arr, key, mid + 1, end);
		else
			return methodB(arr, key, start, mid - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 8, 9, 1, 3, 7, 6 };
		int key = 9;
		int idx = -1;

		Arrays.sort(arr); // 중요,,외우기
		// 오름차순으로 정렬됨

		idx = methodA(arr, key);

		System.out.println(idx);
		System.out.println(methodB(arr, key, 0, arr.length - 1));
	}
}
