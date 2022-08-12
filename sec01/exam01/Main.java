package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		//외부클래스에서 내부클래스에서 선언한 클래스들의 객체 생성해줌
		A a = new A();
		
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();  //인스턴스멤버는 참조변수(b)사용필요
		b.field1 = 3;
		b.method1();
		
	//정적 멤버 클래스 객체 생성 , 인스턴스멤버 사용위해 참조변수(c)사용
		A.C c = new A.C(); 
		c.field1 =3;
		c.method1();
		
//정적멤버는 참조변수 사용 안하고 클래스명으로 바로 필드 및 메서드 사용가능
		A.C.field2 = 3; 
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메서드 호출
		// 인스턴스 멤버 메서드이기 때문에 참조변수(a)를 사용해 호출
		a.method();
	}

}
