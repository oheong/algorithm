import java.util.Scanner;

public class A {
	static String method(String s) {
		char[] charr = s.toCharArray();
		int size = charr.length / 2;
		char temp;
		int tempsize = charr.length - 1;
		for (int i = 0; i < size; i++) {
			temp = charr[i];
			charr[i] = charr[tempsize - i];
			charr[tempsize - i] = temp;
		}
		s = new String(charr);
		return s;
	}

	public static void main(String args[]) {
		// 문자열을 읽어 들여서 그 문자열을 여긍로 출력해봐라
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		// 수행

		s = method(s);

//		char[] charr = s.toCharArray();
//		int size = charr.length / 2;
//		char temp;
//		int tempsize = charr.length - 1;
//		for (int i = 0; i < size; i++) {
//			temp = charr[i];
//			charr[i] = charr[tempsize - i];
//			charr[tempsize - i] = temp;
//		}
//		s = new String(charr); // array to new string object
		
		System.out.println(s);

//		for (int i = 0; i < charr.length; i++) 
//			System.out.print(charr[i]);

		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		sb.reverse();
//		s = sb.toString();
		s = sb.append(s).reverse().toString(); // 헐 대박
		// System.out.println(s);
	}
}
