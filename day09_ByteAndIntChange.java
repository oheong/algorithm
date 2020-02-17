import java.util.Arrays;

public class ByteAndIntChange {
	public static void main(String[] args) {

		int check = 0;
		check = check | 1 << 3; // 3번놈이 체크한것을 3칸 이동시킴.
		check = check | 1 << 13; // 13번놈이 체크한 것을 13칸 이동시킴.
		System.out.printf("3번 체크 : %s\n", ((check & (1 << 3)) != 0) ? "참여함" : "안함");
		System.out.printf("7번 체크 : %s\n", ((check & (1 << 7)) != 0) ? "참여함" : "안함");
		System.out.printf("13번 체크 : %s\n", ((check & (1 << 13)) != 0) ? "참여함" : "안함");
//		int num = 12345;
//		byte[] arr = intToByteArray(num);
//		if (arr != null)
//			System.out.println(Arrays.toString(arr));
//		else
//			System.out.println("오류");
//
//		num = byteArrayToInt(arr);
//		System.out.println(num);
	}

	static int byteArrayToInt(byte[] arr) {
		int su = 0;
		// D C B A
		// 0 0 0 D
		// 0 0 C 0
		// 0 B 0 0
		// A 0 0 0
		// A B C D
		su = arr[0] | arr[1] << 8 | arr[2] << 16 | arr[3] << 24;
		return su;
	}

	static byte[] intToByteArray(int su) {
		byte[] arr = new byte[4];
		// ABCD => A B C D, D C B A
		arr[0] = (byte) su;
		arr[1] = (byte) (su >>> 8); // 8비트가 1byte라서
		arr[2] = (byte) (su >>> 16); // >>> 자바에만 있는 shift 연산자
		arr[3] = (byte) (su >>> 24);
		return arr;
	}
}
