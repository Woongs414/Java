package sec05.exam04;

public class Singleton {
	//private 접근지정자는 public과 달리 클래스 내부에서만 접근 및 호출가능
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInsatnce() {
		return singleton;
	}
	

}
