
public class G {
	public static void main(String[] args) {
		int num1 = 11;
		// 00000000 00000000 00000000 00001011
		// -11
		// 10000000 00000000 00000000 00001011 => 부호와 절대치
		// 11111111 11111111 11111111 11110100 => 부호와 1의 보수
		// 11111111 11111111 11111111 11110101 => 부호와 2의 보수

		int num2 = 7;
		// 00000000 00000000 00000000 00000111

		int num3 = num1 & num2;
		// 00000000 00000000 00000000 00000011
		System.out.println(num3);

		int num4 = num1 | num2;
		// 00000000 00000000 00000000 00001111
		System.out.println(num4);

		int num5 = num1 ^ num2; // 위 아래 비트가 다르면 1 나옴 (XOR)
		// 00000000 00000000 00000000 00001100
		System.out.println(num5);

		int num6 = ~num1; // filed. 1의 보수
		// 11111111 11111111 11111111 11110100 =>-12
		System.out.println(num6);

		// num1 값을 2의 보수 표현 방식으로 바꾸어라
		num1 = ~num1 + 1;

		int res = num2 << 3; // == res = num2*8;
		// 00000000 00000000 00000000 00001110

		int r1 = num1 << 35;
		// => num1 << (35 % 32);

		// 오른쪽에서 3번째 비트가 0인지 1인지 판단하라
		// int sss=num1&(1<<3);
		if ((num1 & (1 << 3)) != 0)
			System.out.println("1");
		else
			System.out.println("0");

	}
}
