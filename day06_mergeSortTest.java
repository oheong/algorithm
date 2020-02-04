import java.util.Arrays;
// MergeSort 이진탐색과 같이 분할정복의 예
// 나눌 수 있는 최대한의 크기로 나눈 후, 병합할 때 정렬을 수행함
public class mergeSortTest {
	static void Merge(int[] arr, int start, int end) {
		int mid = (end - start) / 2;
		int[] arr_l = new int[mid];
		int[] arr_r = new int[mid];
		for (int i = 0; i < mid; i++) {
			arr_l[i] = arr[start + i];
			arr_r[i] = arr[start + mid + i];
		}

		int left = 0, right = 0; // 서브 배열의 길이
		int target = start;
		while ( left < mid || right < mid ) {
			if (left < mid && right < mid) {
				if(arr_l[left]<=arr_r[right]) 
					arr[target++] = arr_l[left++];
				else 
					arr[target++] = arr_r[right++];
			} 
			
			else if (left < mid) 
				arr[target++] = arr_l[left++];
			
			else if (right < mid) 
				arr[target++] = arr_r[right++];			
		}
	}

	static void MergeSort(int[] arr, int start, int end) {
		// 배열들을 나누는 과정

		// 종료 조건
		if (end - start == 1 || end - start == 0)
			return;

		// 재귀호출(분할)
		int middle = (end + start) / 2; // size
		MergeSort(arr, middle, end);
		MergeSort(arr, start, middle);
		// 합치기
		Merge(arr, start, end);
	}

	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		System.out.println(Arrays.toString(arr));

		MergeSort(arr, 0, arr.length);

		System.out.println(Arrays.toString(arr));
	}
}
