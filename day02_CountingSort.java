
public class CountingSort {
	public static void main(String[] args) {
		// 0부터 10까지 K
		int[] arr = { 4, 5, 6, 7, 8, 4 }; // data
		int[] brr = new int[arr.length]; // temp
		int[] count = new int[10 + 1]; // count

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1]; // 앞에 count 누적시킴
		}

		for (int i = arr.length - 1; 0 <= i; i--) {
			brr[count[arr[i]] - 1] = arr[i]; // arr의 값을 인덱스로 사용해 count에서 값을 가지고 온다. count에서 가지고 온 값을 인덱스로 temp에 값을 넣는다.
			count[arr[i]]--;
		}

		for (int su : brr) {
			System.out.print(String.format("%d ", su));
		}
	}
}
