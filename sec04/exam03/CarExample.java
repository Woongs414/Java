package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("추~울바알.");
			mycar.run();
		}
		if(mycar.isLeftGas()) {
			System.out.println("gas주입 필요없다.");
		
		}else {
			System.out.println("gas를 주입하세요");
		}

	}

}
