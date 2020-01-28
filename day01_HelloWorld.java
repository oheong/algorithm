
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ab_cd= 10;
		//변수에 한글 쓸 수 있음 os가 지원하면 가능
		
		float num = 10.56F; // float 뒤에 오는 상수에는 F라는 타입을 알려줘야함
		double num1 = 10.56;
		
		boolean flag=true;//false
		//bool변수에는 true/flase만 들어갈 수 있음 0/1안됨!!!!
		//semiboolean 지원하지 않음!! => 0은 거짓이고 0이외의 숫자는 참으로 판단하겠다.
		num=10;
		if(num==0) {
			System.out.println("참!");
		}
		else {
			System.out.println("아님");
		}
		
		//★정수를 표현하는 방법
		num = 100; //10진수
		num = 0x100; // 16진수
		num = 0100; //8진수 100
		System.out.println(num); // float로 잡혀있어서 64.0으로 출력됨!
		num = 0b100; // 2진수
		System.out.println(num); // float라서 4.0으로 출력
		//byte, short, char, int, long, float, double 기본형 타입에는 이렇게 있음
		
		
		System.out.println("Hello World! 한글");
		//sysout+ctrl+space : 자동입력
		//ctrl+alt+위 아래 방향키 : 복사
		//블럭+ctrl+/ : 주석
		//블럭+ctrl+shift+/ : 블럭 주석
		//ctrl+i : 정렬
		System.out.println("Hello World! 한글1");
/*		System.out.println("Hello World! 한글2"); 
		System.out.println("Hello World! 한글3"); 
		System.out.println("Hello World! 한글4");*/
		System.out.println("Hello World! 한글5"); // 주석
		
		
	}

}
