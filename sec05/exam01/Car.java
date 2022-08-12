package sec05.exam01;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자를 이용한 값 초기화
	Car(String model){
		this.model = model;
	}

	//메서드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "달립니다.(시속:" + this.speed+"km/h");
			
		}
	}
	
	
}
