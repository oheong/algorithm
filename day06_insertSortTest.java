import java.util.Arrays;

public class insertSortTest {
	// insertSort => 1부터 N-1까지 숫자를 뽑아서 뽑은 숫자가 들어갈 적절한 위치를 찾아 삽입.
	static int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j; // 여기서 선언해서 j를 저장하고있는것이 중요함.
			for (j = i - 1; 0 <= j; j--) {
				if (temp < arr[j]) arr[j + 1] = arr[j];
				else break;
			}
			arr[j + 1] = temp;
		}
//		for (int t : arr)
//			System.out.print(String.format("%d ", t));
//		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
