package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton(); //컴파일 에러
		 Singleton obj2 = new Singleton(); //컴파일 에러
		 private 접근제한자 사용해서 외부클래스에서 접근 및 호출 불가능하기때문 */ 

		Singleton singleton1 = Singleton.getInsatnce();
		Singleton singleton2 = Singleton.getInsatnce();
		
		if(singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			 System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
