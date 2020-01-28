
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.println("main 1");
//		methodA(num);
		methodB();
		System.out.println("num : " + num);
		System.out.println("main 1");
	}

	static void methodA(int num) {
		System.out.println("methodA 1");
		num++;
		System.out.println("methodA num : " + num);
		System.out.println("methodA 2");
	}
	static void methodB() {
		// 종료조건이 필요
		System.out.println("method B 1");
		methodB();
		System.out.println("method B 2");
	}
}
