import java.util.LinkedList;
import java.util.Queue;

public class maEChu {
	static class chu{
		int count;
		int man;
	}
	static void bfs(int people) {
		Queue<chu> q = new LinkedList<chu>();
		chu c = new chu();
		c.count=1;
		c.man=people;
		q.add(c);
		while(!q.isEmpty()) {
			int tcount = q.peek().count;
			int tman = q.peek().man;
			q.remove();
			// 한명이 빠질때 현재 peek의 놈 보다 숫자 하나가 더 큰게 처음으로 들어옴
			total_maEchu -= tcount;
			if(total_maEchu<=0) {
				ans = tman;
				return;
			}
			chu rec = new chu();
			rec.man = tman;
			rec.count = tcount+1;
			q.add(rec);
			
			chu cc = new chu();
			cc.man = tman + 1;
			cc.count = 1;
			q.add(cc);
			
		}
	}
	static int ans;
	static int total_maEchu = 20;
	public static void main(String[] args) {
		bfs(1);
		System.out.println(String.format("ans : %d", ans));
	}
}
