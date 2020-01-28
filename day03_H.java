
public class H {
	public static void main(String[] args) {
		String s = "korea japan java";
		int len = s.length();
		System.out.println(len);

		// s=s.replace('a', 'A');
		s = s.replace("korea", "한국");
		System.out.println(s); // 자바는 스트링에 있는 자기 자신을 바꾸지 않음

		String[] srr = s.split("");
		for (String ss : srr)
			System.out.println(ss);
		System.out.println();

		char[] crr = s.toCharArray();
		for (char ch : crr)
			System.out.println(ch);
		System.out.println();

		s = s.toUpperCase();
		System.out.println(s);
		System.out.println();

		System.out.println("=========================================");
		s = "java algo db algo web algo";
		String ss = s.substring(5, 9);
		System.out.println(ss);

		int idx = s.indexOf("algo"); // 왼쪽부터 찾음
		System.out.println(idx);
		idx = s.indexOf("algo", 9); // 왼쪽 n번째 부터 찾음
		System.out.println(idx);
		idx = s.lastIndexOf("algo"); // 오른쪽부터 찾아나감
		System.out.println(idx);

		String my = "kim";
		// String you = new String("kim");
		String you = null;
		if (my.equals(you))
		// if (you.equals(my)) // 뻑남 => null객체에 대한 함수를 불러올 수 없음
			System.out.println("같");
		else
			System.out.println("다름");

		System.out.println("=========================================");
		s="korea";
		//두번째 문자를 구하라
		System.out.println(s.charAt(0));
	}
}
