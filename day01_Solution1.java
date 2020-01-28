import java.util.Scanner;

//9
//7,4,2,0,0,6,0,7,0
public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];//가로
		int[] ans_arr = new int[100];//세로
		int result = 0,max = 0;
		for(int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//솔루션 구축
		for(int i = 0; i < n; i++) {
			int temp=arr[i];
			int count=0;
			for(int j = i+1; j < n; j++) {
				if(temp > arr[j]) count++;
			}
			if(result < count) result = count;
		}
		
		System.out.println(result);
	}

}
