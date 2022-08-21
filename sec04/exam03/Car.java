package sec04.exam03;

public class Car {
	//필드
	int gas;
	
	//CarExample 에서 mycar변수명으로 new연산자이용해 Car()기본형 생성함으로
	//생성자 자동생성(코딩이 보이지는 않음 JAVA에서 자동생성)

	//메서드
	void setGas(int gas) {
		this.gas =gas;
	} //필드값을 외부에서 변경할경우 보안위험발생하기에 setter 메서드 사용

	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
	return false; // return의 기능 : 값 반환 + 메서드 종료(호출한구간으로 이동)
		}else {
				System.out.println("gas가있습니다.");
				return true;
			}
		}
	
	
	void run() {
		while(true) {
			if(gas >0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
	return; //void 사용했기에 반환값 X run()메서드종료(run호출한 구문으로 이동) 
			//		--> 그리고 컴퓨터 진행방향(위 > 아래방향) 코드 실행하면서 진행
			
			}
		}
	}
	
}
