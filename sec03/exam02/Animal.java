package sec03.exam02;

public abstract class Animal {
	
	public String kind;
	
	public Animal() {
		
	}
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	//추상 메서드 : abstract void 메서드() 형태
	public abstract void sound();
}
