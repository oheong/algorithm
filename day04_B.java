
public class B {
	static boolean isDigit(char ch) {
		boolean flag = false;
		if ('0' <= ch && ch <= '9')
			flag = true;

		return flag;
	}

	public static void main(String[] args) {
		String s = "100";
		int num = Integer.parseInt(s, 5); // string to int
		num += 3;
		System.out.println(num);

		char ch = '3';

		// ch 기억의 자료가 숫자인지 아닌지 판단하라
		boolean flag = isDigit('A');
		System.out.println(flag);

		// num = ch - 48; // (int)48 == (char)'3'
		num = ch - '0'; // atoi
		System.out.println(num);

	}
}
