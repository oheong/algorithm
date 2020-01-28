
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 7, 9, 1 };

		int minIdx;
		for (int i = 0; i < arr.length; i++) {
			minIdx = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIdx])
					minIdx = j;
			}
			if (minIdx != i) {
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
		for (int num : arr)
			System.out.print(num + " ");
		
	}
}
