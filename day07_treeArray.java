
public class treeArray {
	static char[] datas;

	static void inOrder() {
		// 한번 해 보기 
		// 2의 n승, 2의 n-1승, 2의 n승 + 1
		int size = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] == '\u0000') {
				size = i;
				break;
			}
		}
		boolean[] visited = new boolean[size];
		int zegop = 0;
		while (true) {
			if (datas[zegop] != '\u0000')
				zegop++;
			else
				break;
		}

		while (true) {
			
		}
	}

	static void findParent(int num) {
		// 노드 번호가 i인 노드의 부모 노드 번호?
		if (num == 1) {
			System.out.println("root입니다.");
			return;
		}
		int temp = num;
		if (num % 2 != 0)
			num--;
		System.out.println(String.format("노드 번호가 %d인 노드의 부모 노드번호 : %d", temp, num / 2));
	}

	static void findChild(int num) {
		if (num * 2 > datas.length) {
			System.out.println("범위를 넘어섰습니다.");
		}
		if (datas[num * 2] == '\u0000') {
			System.out.println(String.format("%d번째 노드의 왼쪽 자식은 없습니다.", num));
		} else {
			System.out.println(String.format("%d번째 노드의 왼쪽 자식 요소 : %c", num, datas[num * 2]));
		}

		if (datas[num * 2 + 1] == '\u0000') {
			System.out.println(String.format("%d번째 노드의 오른쪽 자식은 없습니다.", num));
		} else {
			System.out.println(String.format("%d번째 노드의 오른쪽 자식 요소 : %c", num, datas[num * 2 + 1]));
		}
	}

	public static void main(String[] args) {
		datas = new char[27];
		int size = 13;
		for (int i = 1; i <= size; i++) {
			datas[i] = (char) (i + 64);
		}

		// \u0000
		// inOrder 출력 (중위순회)
		findParent(5);
		findChild(3);

	}
}
