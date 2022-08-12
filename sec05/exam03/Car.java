package sec05.exam03;

public class Car {
	// 정적멤버(static)사용시는 static int speed; -1번
	int speed; //그러나 인스턴스멤버(static사용 X) 필드와 메서드는
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		Car mycar = new Car(); //이렇게 new연산자로 "객체" 만들어서 사용하여야함.
		mycar.speed = 60;
		mycar.run();
		
	} 
		/*speed = 60; - 2번   //객체 안 만들고 필드와 메서드 바로 쓸수있다.
		System.out.println(speed);
	*/
	} 
