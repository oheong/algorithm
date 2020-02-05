import java.util.Stack;

public class D {
	public static void main(String[] args) {
		// SStack s = new SStack();
		Stack<Character> s = new Stack<Character>();
		//s.create(10);
		s.push('A');
		s.push('B');
		s.push('C');
		System.out.println(s.size());
		System.out.println(s.pop());
		s.push('D');
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());
	}

	static class SStack {
		char[] datas;
		int MAX;
		int top = -1;

		void create(int size) {
			datas = new char[size];
			MAX = size;
		}

		void push(char data) {
			if (isFull()) {
				System.out.println("overflow");
				return;
			}
			top++;
			datas[top] = data;
		}

		char pop() {
			if (isEmpty()) {
				System.out.println("overflow");
				return '\u0000';
			}
			char data = datas[top--];
			return data;
		}

		char peek() {
			if (isEmpty()) {
				System.out.println("overflow");
				return '\u0000';
			}
			char data = datas[top];
			return data;
		}

		int size() {
			return top + 1;
		}

		boolean isEmpty() {
			if (top == -1)
				return true;
			else
				return false;
		}

		boolean isFull() {
			if (top == MAX - 1)
				return true;
			else
				return false;
		}
	}
}
//class SStack{} // static안써도됨
