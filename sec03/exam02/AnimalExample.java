package sec03.exam02;

public class AnimalExample {
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
// 인스턴트멤버로 만들어진 sound()메서드이기에
// 참조변수(dog)를 사용하여 Dog 형으로 new Dog()객체 생성. 
// 상속을 통해 Animal요소와 Dog요소 둘다사용가능
// Cat 형도 동일
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//변수의 자동 타입 변환(부모변수타입 = 자식타입;)
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog()); 
		animalSound(dog);
		animalSound(new Cat());
		animalSound(animal); //20줄에서 animal에 고양이주소넣었기에 야옹나옴
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	

}
	}
