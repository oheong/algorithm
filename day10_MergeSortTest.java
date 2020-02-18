import java.util.Arrays;

public class MergeSortTest {
	static int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };

	static void separate(int start, int end) {
		if (end - start == 1 || end - start == 0)
			return;
		int mid = (start + end) / 2;
		separate(start, mid);
		separate(mid, end);
		// 여기서 둘을 합쳐
		merge(start, end);
	}

	static void merge(int start, int end) {
		int mid = ((end - start) / 2);
		int[] arr_l = new int[mid];
		int[] arr_r = new int[mid];
		for (int i = 0; i < mid; i++) {
			arr_l[i] = arr[start + i];
			arr_r[i] = arr[start + mid + i];
		}

		int left = 0, right = 0; // 서브 배열의 길이
		int target = start;
		while (left < mid || right < mid) {
			if (left < mid && right < mid) {
				if (arr_l[left] <= arr_r[right])
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

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		separate(0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
