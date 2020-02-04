import java.util.Arrays;
import java.util.Comparator;

public class C {
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
		Data[] arr = new Data[5]; // 이러면 구조체 배열 생성됨;ㅎㅎ
		Data d = new Data();
		d.num = 3;
		d.jumsu = 84;
		arr[0] = d;

		Data d1 = new Data();
		d1.num = 9;
		d1.jumsu = 51;
		arr[1] = d1;

		Data d2 = new Data();
		d2.num = 5;
		d2.jumsu = 90;
		arr[2] = d2;

		Data d3 = new Data();
		d3.num = 7;
		d3.jumsu = 79;
		arr[3] = d3;

		Data d4 = new Data();
		d4.num = 1;
		d4.jumsu = 81;
		arr[4] = d4;

		for (Data dd : arr) System.out.println(String.format("num : %d, jumsu : %d", dd.num, dd.jumsu));
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
		Arrays.sort(arr);
		for (Data dd : arr) System.out.println(String.format("num : %d, jumsu : %d", dd.num, dd.jumsu));
	}
}
