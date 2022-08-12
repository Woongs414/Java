package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone() 불가능
		// 추상클래스인 Phone은 직접 자신의 객체를 생성하지못한다.
		//아래와 같이 자식클래스를 통해서 객체 생성을 해야한다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
