import java.util.LinkedList;
import java.util.Queue;;

public class CircularQueueTest {
	static class Queue {
		int f, r;
		// r로 값 추가, f로 값 출력 front and rear
		int SIZE = 4;
		char[] datas = new char[SIZE];

		void createQueue() {
			f = r = 0;
		}

		void offer(char ch) { // enQ
			if (isFull()) {
				System.out.println("Queue overflow");
				return;
			}
			r = (r + 1) % SIZE;
			datas[r] = ch;
		}

		char poll() { // deQ
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return ' ';
			}

			f = (f + 1) % SIZE;
			char ch = datas[f];
			return ch;
		}

		boolean isFull() { // 꽉찼냐?
			if ((r + 1) % SIZE == f)
				return true;
			else
				return false;
		}

		boolean isEmpty() { // 비었냐?
			if (f == r)
				return true;
			else
				return false;
		}

		char peek() {
			return datas[f + 1];
		}

		int size() {
			return r - f;
		}
	}

	public static void main(String[] args) {
		 Queue q = new Queue();
		 q.createQueue();
		//java.util.Queue<Character> q = new LinkedList<Character>();

		q.offer('A');
		q.offer('B');
		q.offer('C');
		q.poll();
		q.poll();
		q.offer('E');
		q.offer('F');
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println("end");
	}
}
