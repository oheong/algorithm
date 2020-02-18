
public class SearchCoin {
	static int[] arr = { 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
	static int ans = 0;

	static int sum(int start, int end) {
		int s = 0;
		for (int i = start; i <= end; i++) {
			s += arr[i];
		}
		return s;
	}

	static int binarySearch(int left, int right) {
		if (left > right)
			return -1;
		if (left == right)
			return left;
		int mid = (left + right) / 2;
		while (left <= right) {
			int l = sum(left, mid);
			int r = sum(mid, right);
			if (l < r)
				return binarySearch(left, mid);
			else
				return binarySearch(mid, right);
		}
		return mid;
	}

	public static void main(String[] args) {
		int ans = binarySearch(0, arr.length - 1);
		System.out.println(ans);
	}
}
