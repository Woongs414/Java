package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성(생성자 : Car클래스와 이름 동일)
		Car mycar = new Car();
		
		//필드 값 읽기
		System.out.println("제작회사: " + mycar.company); 
		                           //접근연산자 .이용하여 필드연결
		System.out.println("모델명: " + mycar.model);
		System.out.println("색깔: " + mycar.color);
		System.out.println("최고속도: " + mycar.maxSpeed);
		System.out.println("현재속도: " + mycar.speed);
		
		//필드 값 변경(speed : 0 -- > speed : 60)
		mycar.speed = 60;
		System.out.println("수정된 속도: " + mycar.speed);
		

	}

}
