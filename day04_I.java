import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class I {
	static int getPriority(char ch) {
		int result = 0;
		switch (ch) {
		case '+':
		case '-':
			result = 1;
			break;
		case '*':
		case '/':
			result = 2;
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(6+5*(2-8)/2)";

		String postOrder = doPostOrder(str);
		System.out.println(postOrder);

		int result = doCalc(postOrder);
		System.out.println(result);
	}

	static int doCalc(String s) {
		int n1, n2, n3;
		Stack<Integer> stack = new Stack<Integer>();
		char[] crr = s.toCharArray();
		for (char ch : crr) {
//	         Character.isDigit(ch)
			if (ch >= '0' && ch <= '9') {
//	            stack.push(Integer.parseInt(ch+""));
				stack.push(ch - '0');
			} else {
				n2 = stack.pop();
				n1 = stack.pop();
				n3 = calc(ch, n1, n2);
				stack.push(n3);
			}
		}
		return stack.pop();
	}

	static int calc(char op, int n1, int n2) {
		int result = 0;
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		return result;
	}

	static String doPostOrder(String s) {
		String result = "";
		char[] crr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char ch : crr) {
			if (ch == '(') {
				stack.push(ch);
			} 
			else if (ch >= '0' && ch <= '9') {
				result += ch;
			} 
			else if (ch == ')') {
				char temp;
				while (!stack.isEmpty()) {
					temp = stack.pop();
					if (temp == '(') {
						break;
					}
					result += temp;
				}
			} 
			else {
				while (!stack.isEmpty()) {
					if (getPriority(ch) <= getPriority(stack.peek())) {
						result += stack.pop();
					} else {
						break;
					}
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}

}
