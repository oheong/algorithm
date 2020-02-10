
public class BSTTest {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(9);
		bst.insert(4);

		System.out.println(bst.search(4));
		System.out.println(bst.search(10));
	}

	static class BST {
		// tree
		Node root;

		boolean search(int data) {
			if (root == null)
				return false;
			Node temp = root;
			while (temp != null) {
				if (temp.data == data)
					return true;
				else if (temp.data < data)
					temp = temp.right;
				else
					temp = temp.left;
			}
			return false;
		}

		void insert(int data) {
			if (root == null) {
				// 루트에 바로 넣기
				Node temp = new Node(data);
				root = temp;
				return;
				// root.data = data => root자체가 null이라 아무것도없음.
				// 객체자체가 없는것임.
				// 그래서 이렇게는 절대 넣어주면 안되고, 새로운 객체를 하나 만들어서 그거에다 넣고 그것을 루트로 만들어줘야함
			}
			Node temp = root;
			Node tempData = new Node();
			tempData.data = data;
			while (temp != null) {
				if (temp.data == data)
					return;

				// 루트보다 작은지?
				if (data < temp.data) {
					if (temp.left == null) { // 여기에는 넣기
						temp.left = tempData;
						break;
					} else
						temp = temp.left;
				}
				// 루트보다 큰지?
				else if (temp.data < data) {
					if (temp.right == null) { // 여기에는 넣기
						temp.right = tempData;
						break;
					} else
						temp = temp.right;
				}
			}
		}
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node() {
		}

		public Node(int data) {
			super();
			this.data = data;
		}

	}
}
