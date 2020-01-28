
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 5500, 700, 78, 12, 42 };
		// {41, 85, 72, 38, 80, 69, 65, 68, 96, 22, 49, 67, 51, 61, 63, 87, 66};

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// 구현
		for (int i = 0; i < arr.length; i++) {
			int size = arr.length - i - 1; // 최대한 아껴주자
			for (int j = 0; j < size; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
