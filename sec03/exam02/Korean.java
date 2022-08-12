package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String n, String s) {
		name = n;
		ssn = s;
		
	}
	/* public Korean(String name, String ssn){
	  this.name = name;
	  this.ssn = ssn;
위 형식이 2번째 형식보다 더 좋은 형식이다(자바가 안헷갈려함 this.변수명 = 매개변수)
 this로 	지칭 해주기 때문)
	 }*/

}
