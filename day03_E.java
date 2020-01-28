
public class E {

	static void dfs(int arr[], int d) {
		if (d == 3) {
			for (int i = 0; i < 3; i++)
				System.out.print(arr[i]);
			System.out.println();
			return;
		}
		arr[d] = 0;
		dfs(arr, d + 1);
		arr[d] = 1;
		dfs(arr, d + 1);
	}

	static String[] srr = { "0", "1" };

	static void method(String result, int num) { // 오 이런 방법도 있구나,,,
		if (num == 0) {// base case
			System.out.println(result);
			return;
		}
//		method(result + "0", num - 1);
//		method(result + "1", num - 1);
		for (int i = 0; i < 2; i++)
			method(result + srr[i], num - 1);

	}

//	static String doStringComma(int d, String a, String b) {
//		if (d == a.length()) {
//			return b;
//		}
//		b += a.substring(d, d + 1);
//		b += ",";
//		return doStringComma(d + 1, a, b);
//	}
	static String doStringComma(String a, String b) {
		if (a.length() == 1) {
			return b + a.charAt(0);
		}
		return doStringComma(a.substring(1, a.length()), b + a.charAt(0) + ","); // 오 대박,,
	}

	public static void main(String[] args) {
		// 2진수 3자리를 구성할 수 있는 재귀함수를 만들어라
		int[] arr = new int[3];
		dfs(arr, 0);
		System.out.println("===========");

		method("", 4);
		System.out.println("===========");

		// 문자열을 전달받아 그 문자 사이에 ,를 결합하여 변환하는 재귀함수를 만들어라
		// String s = doStringComma(0, "korea", "");
		String s = doStringComma("korea", "");
		System.out.println(s);
	}
}
