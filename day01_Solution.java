import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int test = 1; test<=TC; test++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println("#" + test + " "+ sum);
		}
	}

}
