import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int jumsu = 100;
		String result= "";
//		if(jumsu>=90) System.out.println("A");
//		else if(80<=jumsu) System.out.println("B");
//		else if(70<=jumsu) System.out.println("C");
//		else if(60<=jumsu) System.out.println("D");
//		else System.out.println("F");
		
//		switch(jumsu/10) {
//		case 10:
//		case 9 : 
//			result="A";
//			break;
//		case 8 : 
//			result="B";
//			break;
//		case 7 : 
//			result="C";
//			break;
//		case 6 : 
//			result="D";
//			break;
//		default :
//			result="F";
//		}
//		System.out.println(result);
		
//		ssafy : for(int i=0;i<10;i++) { // 꼭 라벨링을 해 줘야함!
//			for(int j=0;j<10;j++) {
//				if(i==5)break ssafy; // 지정된 반복문을 벗어나고 싶을 때
//				System.out.println("i : "+i+", j: "+j);
//			}
//		}

//		int num = 0;
//		//num=10+ ++num;
//		//num=10+ num++;
//
//		while(num <= 10) {
//			System.out.println(num++);	
//			//num++;
//		}
		
//		int[] nums = new int[10];
//		int[] aaa = {10,20,30};
//		//nums 배열에 1부터 10까지 값을 채워라
//		for(int i=0; i < nums.length; i++) {
//			nums[i] = i + 1;
//			//System.out.println(nums[i]);
//		}
//		System.out.println(Arrays.toString(nums)); // 오 ㅁㅊ 이거머임
		
		//입력받은 행 갯수 열 갯수 만큼 만들어서~
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		System.out.println(sc.next());
		System.out.println(sc.next());

		//		int[][] arr = new int[5][];
//		arr[0] = new int[3];
//		arr[1] = new int[5];
//		arr[2] = new int[7];
//		arr[3] = new int[9];
//		arr[4] = new int[3];
//		//먼데이거,,, 기능 개쩐다,,
//		
//		int cnt = 1;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) { //뭔데이거 개쩐다,,
//				//arr[i][j] = j*i + j + 1;
//				arr[i][j] = cnt++;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) { //뭔데이거 개쩐다,,
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println(nums.length);
//		System.out.println(aaa.length);
//		System.out.println(nums[2]);
//		System.out.println(aaa[1]);
		
		
	}
}
