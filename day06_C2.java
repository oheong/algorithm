import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class C2 {
	static class Data implements Comparable<Data>{ // 여기는 comparable임!
		int num;
		int jumsu;
		@Override
		public int compareTo(Data o) { // 인자가 하나밖에 없음
			// TODO Auto-generated method stub
			return o.jumsu - jumsu;
		}
	}

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<>();
		Data d = new Data();
		d.num = 3;
		d.jumsu = 84;
		list.add(d);

		Data d1 = new Data();
		d1.num = 9;
		d1.jumsu = 51;
		list.add(d1);

		Data d2 = new Data();
		d2.num = 5;
		d2.jumsu = 90;
		list.add(d2);

		Data d3 = new Data();
		d3.num = 7;
		d3.jumsu = 79;
		list.add(d3);

		Data d4 = new Data();
		d4.num = 1;
		d4.jumsu = 81;
		list.add(d4);
		
		Collections.sort(list);

		for (Data dd : list) System.out.println(String.format("num : %d, jumsu : %d", dd.num, dd.jumsu));
		System.out.println("==============");
		
//		Arrays.sort(arr, new Comparator<Data>() {
//			@Override
//			public int compare(Data o1, Data o2) {
//				// TODO Auto-generated method stub
//				//return o1.num - o2.num; // 번호에 따른 오름차순
//				//return o2.num - o1.num; // 번호에 따른 내림차순
//				return o2.jumsu - o1.jumsu; // 번호에 따른 내림차순
//			}
//		});
	}
}
