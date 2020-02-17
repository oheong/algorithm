import java.util.HashMap;
import java.util.Scanner;

public class swea0217WS {
	static int N, M, T;
	static HashMap<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		map.put("0001101", "0");
		map.put("0011001", "1");
		map.put("0010011", "2");
		map.put("0111101", "3");
		map.put("0100011", "4");
		map.put("0110001", "5");
		map.put("0101111", "6");
		map.put("0111011", "7");
		map.put("0110111", "8");
		map.put("0001011", "9");

		for (int test = 0; test < T; test++) {
			N = sc.nextInt();
			M = sc.nextInt();
			int flag = 0;
			int[] arr = new int[8];
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				if (flag == 0) {
					for (int j = 0; j < str.length(); j++) {
						if (str.charAt(j) == '1') {
							flag = 1;
							break;
						}
					}
				}

				else {
					// 스트링 다 받아와서 하나하나 확인함 확인하고나서 그 숫자가 해쉬에 있는지도 확인
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < str.length(); j++) {
						sb.append(str.charAt(j));
					}
					// sb에 다 넣었고 뒤에서부터 살펴보기
					int size = sb.length() - 1;
					str = sb.toString();
					int cnt = 7;
					for (int j = size; 7 < j; j--) {
						// System.out.println(str.substring(j - 7, j));
						if (map.get(str.substring(j - 7, j)) != null) {
							arr[cnt--] = Integer.parseInt(map.get(str.substring(j - 7, j)));
							j -= 6;
						}
					}
				}
			}

			int holSum = 0, jjakSum = 0;
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0)
					holSum += arr[i];
				else
					jjakSum += arr[i];
			}
			System.out.print(String.format("#%d ", test + 1));
			if (((holSum * 3) + jjakSum) % 10 == 0)
				System.out.println(holSum + jjakSum);
			else
				System.out.println(0);
			
		}
	}
}
