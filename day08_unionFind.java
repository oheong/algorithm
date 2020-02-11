
public class unionFind {
	static int[] parent = new int[10 + 1];

	public static void main(String[] args) {
		// 10개 정도의 집합이 있어서 그 집합을 서로소 집합으로 관리하기

		makeSet();
		// int idx = findSet(2);
//		System.out.println(findSet(2));
//		System.out.println(findSet(5));
		union(2, 5); // 5를 2의 집단으로 넣어라
		union(4, 7);
		union(5, 4);
		System.out.println(findSet(2));
		System.out.println(findSet(7));
	}

	static void union(int x, int y) {
		x = findSet(x); // 앞으로 x 쓸 일 없으니까 재활용 할 수 있음
		y = findSet(y);
		if (x == y)
			return;
		parent[y] = x;
	}

	static int findSet(int x) {
		if (x == parent[x])
			return x;
		return parent[x] = findSet(parent[x]); // 사실 이거 잘 모르겠음;
		
//		int px = findSet(parent[x]);
//		parent[x] = px;
//		return px;
	}

	static void makeSet() {
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
	}
}
