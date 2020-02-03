import java.util.LinkedList;
import java.util.Queue;

// java Queue의 정석

public class miroBFS {
	static class Q {
		int y;
		int x;
		int step;
	}

	static int[] by = { 1, -1, 0, 0 };
	static int[] bx = { 0, 0, 1, -1 };
	static int[][] map = new int[][]{  
		{0,0,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,0,1,1,1,1},
		{1,1,1,0,1,1,1,1},
		{1,0,0,0,0,0,0,1},
		{1,0,1,0,0,0,1,1},
		{1,0,0,0,0,0,0,0},
		{1,1,1,1,1,1,1,0}
	};	
	static int result = 2123456789;
	static void bfs(int y, int x) {
		int[][] visited = new int[map.length][map[0].length];
		Queue<Q> q = new LinkedList<Q>();
		
		//enQ 할 때는, 새로운 객체를 만들어서 거기에 값을 넣고 다시 add해줘야함;
		Q queue = new Q();
		queue.y = y;
		queue.x = x;
		queue.step = 1;
		q.add(queue);
		// ㅎㅎ 거지같은 자바
		
		visited[y][x] = 1;
		while (!q.isEmpty()) {
			int ty = q.peek().y;
			int tx = q.peek().x;
			int tstep = q.peek().step;
			q.remove();
			if (ty == map.length - 1 && tx == map[0].length - 1) {
				if(tstep < result) result = tstep;
				System.out.println(String.format("y : %d, x : %d step : %d min : %d", ty, tx, tstep, result));
				break;
			}
			for (int i = 0; i < 4; i++) {
				int ny = ty + by[i];
				int nx = tx + bx[i];
				if (0 <= ny && ny < map.length && 0 <= nx && nx < map[0].length && visited[ny][nx] == 0 && map[ny][nx] == 0) {
					visited[ny][nx] = 1;
					Q temp = new Q(); // 도랏 새로만들어서 넣어줘야함ㅠ 
					temp.y = ny;
					temp.x = nx;
					temp.step = tstep + 1;
					q.add(temp);
					//와 이거뭐임 진짜;
				}
			}
		}
	}

	public static void main(String[] args) {

		bfs(0, 0);
		System.out.println("end");
	}
}
