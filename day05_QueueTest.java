
public class QueueTest {
	static class Queue {
		int f, r;
		// r로 값 추가, f로 값 출력 front and rear
		int SIZE = 4;
		char[] datas = new char[SIZE];

		void createQueue() {
			f = r = -1;
		}

		void offer(char ch) { // enQ
			if (isFull()) {
				System.out.println("Queue overflow");
				return;
			}
			r++;
			datas[r] = ch;
		}
		
		char poll() { // deQ
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return ' ';
			}
			
			//return datas[++f];
			f++;
			char ch = datas[f];
			if(f == r) {
				f = r = -1;
			}
			return ch;
		}

		boolean isFull() { // 꽉찼냐?
			if (r == SIZE - 1) return true;
			else return false;
		}

		boolean isEmpty() { // 비었냐?
			if (f == r) return true;
			else return false;
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
//		q.offer('A'); // enQ
//		q.offer('B'); // enQ
//		q.offer('C'); // enQ
//		System.out.println(q.size());
//		char ch = q.poll();
//		System.out.println(ch);
//		System.out.println(q.peek());
//		System.out.println(String.format("size : %d", q.size()));
//		q.offer('D');
//		System.out.println(String.format("size : %d", q.size()));
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println("end");
		
		q.offer('A');
		q.offer('B');
		q.offer('C');
		q.offer('D');
		q.poll();
		q.poll();
		q.poll();
		q.poll();
		q.offer('E');
		System.out.println("end");
	}
}
