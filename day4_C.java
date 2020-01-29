import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in); // 콘솔에 키보드로
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		int a, b;
		for (int test = 0; test < T; test++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(String.format("#%d %d", test + 1, a + b));
		}
	}
}
