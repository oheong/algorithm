import java.util.Arrays;

public class QuickSortTest {
	static int[] arr = { 1, 3, 2, 4, 6, 9, 1, 8, 9, 7, 5 };

	static void QuickSort(int[] arr, int left, int right) {
		if (left > right)
			return;

		int pivot = left;
		int l = left + 1;
		int r = right;

		while (l <= r) {
			while (l <= r && arr[l] <= arr[pivot]) // 범위들이 안넘어가게 잘 정해줘야함
				l++;
			while (l <= r && arr[pivot] <= arr[r]) // 범위들이 안넘어가게 잘 정해줘야함
				r--;
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}

		int temp = arr[pivot];
		arr[pivot] = arr[r]; // 오른쪽꺼 넣어줘야함
		arr[r] = temp;
		pivot = r;

		QuickSort(arr, left, pivot - 1); // 왼쪽
		QuickSort(arr, pivot + 1, right); // 오른쪽
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		QuickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
