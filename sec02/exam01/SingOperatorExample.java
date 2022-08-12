package sec02.exam01;

public class SingOperatorExample {

	public static void main(String[] args) {

		int x = -100;
		int result1 = +x; // +1 * -100 = -100
		int result2 = -x; // -1 * -100 = +100
		System.out.println("result1 =" + result1);
		System.out.println("result2 =" + result2);
		
		
		byte b = 100;
	int result = -b; // -1 * 100 = -100 (byte가 곱셈을 실행후 int로 바뀜)
		byte result3 = (byte)-b;
		System.out.println(result);
		System.out.println(result3);
		
	}

}
