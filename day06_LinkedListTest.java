import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// A, B, C, D, E 항목 관리
		
		ArrayList<Character> list = new ArrayList<Character>();
		// arraylist는 배열로써 첨자를 사용하기때문에 데이터를 읽어오는데 편리하다
		// 데이터를 저장하고 삭제하는데는 오래걸림
		LinkedList<Character> list1 = new LinkedList<Character>();
		// linkedlist는 연결리스트로써 앞뒤 포인터를 갖고있기때문에 데이터를 저장하고 삭제하는데 편리하다
		// 데이터를 읽어오는거는 시간이 오래걸림
		
		list.add(0, 'A'); // add to first 속도 엄청 느림	
		list.add(new Character('B')); // add to last 
		list.add('C');	
		list.add('D');	
		
		Character c = list.remove(2); // index를 가지고 삭제하는 것. 배열리스트라 빠르게 가능
		System.out.println(String.format("remove : %c", c));
		boolean flag = list.remove(new Character('C')); // 지웠으면 true, 아니면 false
		System.out.println(flag);
		System.out.println(c);
		
		int size = list.size();
//		for(int i = 0; i < size; i++) 
//			System.out.print(String.format("%c ", list.get(i)));
		for(Character ch : list) {
			System.out.print(String.format("%c ", ch));
		}System.out.println();
		
		
//		==========================================================================
		list1.addLast('A');
		list1.addLast('B');
		list1.addLast('C');
		list1.addLast('D');
		//addtoFirst가 시간을 덜 잡아 먹음. 뒤에서 추가하기위해서는 연결리스트를 처음부터 끝까지 다 살펴봐야하기때문
		
		System.out.println("=====================================");
		System.out.println(list1.removeFirst()); // 무조건 첫번째 꺼 지움
		System.out.println(list1.remove()); // 이거도 첫번째 꺼 지
		System.out.println(list1.remove());
		System.out.println(list1.remove());
//		System.out.println(list1.remove()); // 요소가 네개 있었는데 다섯번  remove하면 뻑남
		System.out.println(list1.isEmpty());
		System.out.println("=====================================");
		
		System.out.println(list.size());
//		for(int i=0;i<list.size();i++) 
//			System.out.println(list1.get(i)); // get 메소드는 느림. 완전느림. linkedlist는 이 방법 사용x
		for(Character ch : list1) {
			System.out.println(ch);
		}
		
		Iterator<Character> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
	}
}
