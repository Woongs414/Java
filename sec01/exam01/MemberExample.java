package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) { //매개값 Member형 id필드값도 동일 : true
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 boj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) { // 매개값 Member형이지만 id필드값 다름 : false
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 boj3는 동등하지 않습니다.");
		}
		

	}

}
