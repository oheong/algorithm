import java.util.Scanner;

public class solutions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String message = sc.nextLine();
		char[][] arr = new char[5][20];
		for (int test = 1; test <= T; test++) {
			for (int s = 0; s < 5; s++) {
				message = sc.nextLine();
				//System.out.println(message);
				char[] array = message.toCharArray();
				for (int j = 0; j < message.length(); j++) {
					arr[s][j] = array[j];
					//System.out.println(arr[s][j]);
				}
				
				//배열 가져오면됨 어휴,,,,
				String ans="";
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						//if(arr[j][i]=='\n'||arr[j][i]=='\0')continue;
						System.out.print(arr[j][i]);
					}
				}
			}System.out.println();
		}
	}
}
