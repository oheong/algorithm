import java.util.Arrays;

public class BinarySearch {
	static int dfs(int[] arr, int key, int left, int right) {
		if (left > right)
			return -1;
		int mid = (left + right) / 2;
		if (arr[mid] == key)
			return mid;
		else if (arr[mid] > key)
			return dfs(arr, key, left, mid - 1);
		else
			return dfs(arr, key, mid + 1, right);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 44, 5, 67, 78, 91, 96, 4, 33, 53, 6, 9 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int key = 67;
		int idx = dfs(arr, key, 9, arr.length);
		System.out.println(idx == -1 ? "못찾음" : "찾음");
	}
}
