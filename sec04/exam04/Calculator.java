package sec04.exam04;

public class Calculator {
	//필드
	//생성자
	//메서드
	int plus(int x , int y) {
		int result = x + y;
		return result; //result 값 17을 int형으로 아래 plus(x,y)대입해 변경
	}
	double avg(int x, int y) {
		double sum = plus(x,y); // plus(int x ,int y)메서드로 이동
		double result = sum / 2; // sum은 더블형 8.5대입
		return result; // 아래 avg(7,10)을 8.5로 반환
	}

	void execute() {
		double result = avg(7,10); //avg(int x, int y)메서드로 이동
		println("실행결과: " + result); // 외부클래스 execute()로 이동
	}
	void println(String message) {
		System.out.println(message); //위에 println으로 이동
	}
}
