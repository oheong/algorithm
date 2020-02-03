// 백트래킹
public class Mirro {
	static int[][] map;
	static int[][] visited;
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,-1,1};
	static int ans_y, ans_x,count = 0;
	static int min = 2123456789;
	static int cnt1;

	static void dfs(int y, int x, int cnt) {
		if(y < 0 ||map.length <= y || x < 0 || map[0].length <= x || map[y][x] == 1 || visited[y][x] == 1) return;
		if(y == map.length - 1 && x == map[0].length - 1) {
			ans_y=y;
			ans_x=x;
			count++;
			if(min>cnt)min=cnt;
			System.out.println(cnt);
			System.out.println(cnt1);
			return;
		}

		visited[y][x] = 1;
		cnt1++;
		for(int i = 0; i < 4; i++) {
			dfs( y + dy[i], x + dx[i], cnt+1);
		}
		// 이 자리에 대한 부분이 백트래킹임
		cnt1--;
		visited[y][x] = 0;
	}
	public static void main(String[] args) {
		map = new int[][]{  
			{0,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,1},
			{1,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,0}
		};	
		visited = new int[map.length][map[0].length];

		dfs(0, 0, 1);
		//System.out.println(count);
		if(ans_y != 0 && ans_x != 0)
		System.out.println(String.format("goal : y = %d x = %d",ans_y,ans_x));
		else System.out.println("No Ans");
	}
}