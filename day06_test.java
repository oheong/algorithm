import java.util.Arrays;
import java.util.Comparator;

public class test {
	public static void main(String[] args) {
		// 입력된 데이터 중에 오름차순으로 정렬한 경우 앞에서 5번째 내용을 출력하라
		Integer[] arr = { 2, 16, 31, 2, 16, 8, 31, 22 };
		int[][] arr1 = { 
				{ 1, 3 }, 
				{ 5, 2 }, 
				{ 7, 8 }, 
				{ 9, 4 }, 
				{ 3, 1 } };
		// Ingeter[]는 객체임
		// int[]는 객체가 아님

		Arrays.sort(arr); // 오름차순
		// System.out.println(Arrays.toString(arr));
		System.out.println(arr[5]);

		Arrays.sort(arr, Comparator.reverseOrder()); // 역순 정렬
		Arrays.sort(arr, new Comparator<Integer>() { // 소팅할건데~ 내가 주는 기준대로 소팅해라~ 배열 앞의 생성자Ingeter를 넣어줌
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1; // 내림차순
			}
		});
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr1.length; i++)
			System.out.println(Arrays.toString(arr1[i]));
		System.out.println("==========");
		Arrays.sort(arr1, new Comparator<int[]>() { // compare할건데 배열 앞의 생성자 int[]를 넣어라

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0]; // 오름차순
			}
		});
		for (int i = 0; i < arr1.length; i++)
			System.out.println(Arrays.toString(arr1[i]));
	}
}
