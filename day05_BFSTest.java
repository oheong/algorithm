import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {
	public static void main(String[] args) {
		int[][] map= new int[9 + 1][9 + 1];
		map[1][2] = 1;
		map[2][1] = 1;

		map[3][1] = 1;
		map[1][3] = 1;

		map[4][1] = 1;
		map[1][4] = 1;

		map[2][5] = 1;
		map[5][2] = 1;

		map[2][6] = 1;
		map[6][2] = 1;

		map[4][7] = 1;
		map[7][4] = 1;

		map[4][8] = 1;
		map[8][4] = 1;

		map[4][9] = 1;
		map[9][4] = 1;


		bfs(map, 1);
		
	}
	
	static char[] datas = {' ','A','B','C','D','E','F','G','H','I'};
	static void bfs(int[][] map, int start) {
		int[] visited = new int [map.length + 1];
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start); // offer
		int idx = 0;
		while(!q.isEmpty()) {
			idx = q.remove(); // poll
			// 방문체크
			visited[idx] = 1; 
			
			//업무 실행
			System.out.print(String.format("%c ", datas[idx]));
			
			//인접한 정점 실행
			for(int i = 1; i < map.length; i++) {
				if(map[idx][i] == 1 && visited[i] == 0) {
					q.add(i);
				}
			}
		}
	}
}







