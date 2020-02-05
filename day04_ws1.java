import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class ws1 {
	static int t = -1;
	 static int getPriority(char ch) {
	      int result = 0;
	      switch(ch) {
	      case '+':   case '-':
	         result = 1;
	         break;
	      case '*':   case '/':
	         result = 2;
	         break;
	      }
	      return result;
	   }

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int test = 1; test < 11; test++) {
			int len = sc.nextInt();
			String str = sc.next();
			t = -1;
			String postOrder = doPostOrder(str);
			System.out.println(String.format("#%d %d", test, doCalc(postOrder)));
		}
	}

	static String doPostOrder(String s) {
		String ans = "";
		char[] crr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char ch:crr) {
			 if(ch>='0' && ch<='9') {
		            ans+=ch;
			 }
			 else {
					while (!stack.isEmpty()) {
						if (getPriority(ch) <= getPriority(stack.peek())) {
							ans += stack.pop();
						} else {
							break;
						}
					}
					stack.push(ch);
				}
			}
			while (!stack.isEmpty()) {
				ans += stack.pop();
			}
		
		
		
		return ans;
	}

	static int doCalc(String s) {
		// 후위연산자 계산 메소드
		char[] crr = s.toCharArray();
		int[] sstack = new int[crr.length];
		for (int i = 0; i < crr.length; i++) {
			if ('0' <= crr[i] && crr[i] <= '9') {
				pushint(sstack, crr[i] - '0');
			} else {
				if (crr[i] == '+')
					pushint(sstack, (popint(sstack) + popint(sstack)));
				else
					pushint(sstack, (popint(sstack) * popint(sstack)));
			}
		}
		return popint(sstack);
	}


	static void pushint(int[] arr, int n) {
		t++;
		arr[t] = n;
	}

	static int popint(int[] arr) {
		return arr[t--];
	}

	static boolean isEmpty() {
		if (t == -1)
			return true;
		else
			return false;
	}
}
