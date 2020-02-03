import java.util.Iterator;
import java.util.LinkedList;

public class linkedListTest {
	static class Queue{
		Node front = null;
		Node rear = null;
		int size = 0;
		void offer(char ch) { // enQ
			Node temp = new Node();
			temp.data = ch;
			//temp.next = null; // 어차피 만들면 null이라 생략 가능
			
			if(isEmpty()) // Queue가 비어있으면
				front = temp;
			else // Queue가 비어있지 않으면
				rear.next = temp;	
			rear = temp;
			size++;
		}
		char poll() {
			char ch = ' ';
			if(front == null) {
				System.out.println("비워져 있는 큐");
				return ' ';
			}
			ch = front.data; // 반환 되어야 할 데이터
			front = front.next;
			if(front == null) { // 큐가 비어있으면
				rear = null;
			}
			size--;
			return ch;
		}
		int size() {
			return size;
		}
		private boolean isEmpty() { // private 외부 클래스에서는 접근 불가
			if(front == null && rear == null) return true;
			else return false;
		}
	}
	static class Node{
		//데이터를 관리하는 클래스
		char data;
		Node next = null;
		Node front = null;
		Node rear = null;
	}
	public static void main(String[] args) {
		//Queue q = new Queue();
		java.util.Queue<Character> q = new LinkedList<Character>(); // Queue는 LinkedList로만 생성 가능
		System.out.println(q.size());
		q.offer('A');// enQ
		q.offer('B');// enQ
		q.offer('C');// enQ

//		Node temp = q.front;		
//		while(temp != null) {
//			System.out.print(String.format("%c ", temp.data));
//			temp = temp.next;
//		}
//		System.out.println();
		
		Iterator<Character> it = q.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println(q.poll()); // A
		//System.out.println(String.format("peek : %c", q.peek()));
		q.offer('D');// enQ
		q.offer('E');// enQ
		System.out.println(q.size());
		System.out.println(q.poll()); // B
		System.out.println(q.poll()); // C
		System.out.println(q.poll()); // D
		System.out.println(q.size());
		System.out.println(q.poll()); // E
		System.out.println(q.poll()); // x
		System.out.println("end");
	}
}
