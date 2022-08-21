package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		//잘못된 속도변경
		mycar.setSpeed(-50);
		System.out.println("현재속도는 "+ mycar.getSpeed());
		
		//올바른 속도변경
		mycar.setSpeed(60);
		
		//멈춤 , boolean의 기본값은 false
		if(!mycar.isStop()) {
			mycar.setStop(true); 
		}
		System.out.println("현재속도는 " + mycar.getSpeed());
	}

}
  //클래스변수(정적변수) , 인스턴스변수(ststic X)