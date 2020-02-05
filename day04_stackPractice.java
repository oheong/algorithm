import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stackPractice {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		SStack s = new SStack();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				s.push('(');
			}

			else if (arr[i] == ')') {
				if (s.isEmpty())// 비어있으면
					break;// 걍 넘어가고

				// 안비어있으면
				if (s.peek() == '(')
					s.pop();
				else
					break;
			}
		}
	}

	static class SStack {
		char[] data = new char[500];
		int t = -1;

		void push(char c) {
			t++;
			data[t] = c;
		}

		char pop() {
			return data[t--];
		}

		char peek() {
			return data[t];
		}

		boolean isEmpty() {
			if (t == -1)
				return true;
			else
				return false;
		}
	}
}
