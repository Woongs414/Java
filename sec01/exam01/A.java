package sec01.exam01;

public class A {
	//바깥 클래스
	A(){System.out.println("A객체가 생성됨");}

	//인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B객체가 생성됨");}
		int field1; //인스턴스 멤버 필드
		//static int field2; 정적멤버 필드
		void method1() {} //인스턴스 멤버 메서드
		//static void method1() {} 정적멤버 메서드
	}
	
	//정적멤버 클래스
	static class C {
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스
		class D {
			D() {System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//void method2(){}
			}
		//메서드 사라지면 D클래스는 없어지기에 메서드 안에
		// 객체생성하고 필드값 초기화와 메서드를 호출한다.
		D d = new D();
		d.field1 = 3;
		d.method1();
		}
	
	}

	

