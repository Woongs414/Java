package sec02.exam01;

public class ICarExample {

	public static void main(String[] args) {
		//KumhoTire a = new KumhoTire();
		// 14번 줄처럼 객체 생성하면서 바로 선언(호출)해도 되고
		// 6번줄과 16번줄처럼 객체 생성 먼저 하고 선언(호출)해도 된다.
		
		
		ICar mycar = new ICar();
		mycar.run();
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();
		//mycar.frontRightTire = a;
		
		mycar.run();

	}

}
