package pro01;

public class CatExample {

	public static void main(String[] args) {
	    Cat c = new Cat();
		System.out.println(c.name); // 값 없으면 Null
		System.out.println(c.breeds); //객체생성후 값 없으면 Null
		System.out.println(c.age); // 값 없으면 0
		System.out.println(c.weight); //객체생성후 값 없으면 0.0
	}

}
