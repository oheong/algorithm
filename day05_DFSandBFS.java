import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSandBFS {
	static int N;
	static int M;
	static int S;
	static void bfs(int[][] map, int N, int start) {
		int[] visited = new int[N + 1];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty()) {
			int index = q.remove();
			visited[index] = 1;
			System.out.print(String.format("%d ", index));
			for(int i = 1; i < N; i++) {
				if(map[index][i] == 1 && visited[i] == 0) {
					visited[i] = 1;
					q.add(i);
				}
			}
		}
	}
	static void dfs(int [] visited, int d, int[][] map, int N, int start) {
		visited[start] = 1;
		System.out.print(String.format("%d ", start));
		for(int i = 1; i < N; i++) {
			if(map[start][i] == 1&&visited[i]==0) {
				dfs(visited, d + 1, map, N, i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.nextInt();
		
		int[][] map = new int[N + 1][N + 1];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		//dfs
		int[] visited = new int[N + 1];
		dfs(visited, 1, map, N + 1, S);
		System.out.println();
		//bfs
		bfs(map, N + 1, S);
	}
}
