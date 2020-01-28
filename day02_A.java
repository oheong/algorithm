import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// 손님이 낸 돈과 비용을 입력받아 잔돈의 갯수를 출력하라
		// 10000원을 냈는데 비용이 5680원이다.
		// 잔돈은 1000, 500, 100, 50, 10

		Scanner sc = new Scanner(System.in);
		// Scanner scfile = new Scanner(new FileInputStream("input.txt"));

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans = 0;

		// 솔루션 입력
		// Greedy
		int temp_money = num1 - num2; // 4320
		ans += temp_money / 1000;
		temp_money %= 1000;
		ans += temp_money / 500;
		temp_money %= 500;
		ans += temp_money / 100;
		temp_money %= 100;
		ans += temp_money / 50;
		temp_money %= 50;
		ans += temp_money / 10;
		// temp_money %= 10;

		System.out.println(ans);
	}

}
