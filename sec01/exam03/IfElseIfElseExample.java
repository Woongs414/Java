package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 65;
		
		if(score>=90) {
			System.out.println("점수 100~90");
			System.out.println("등급 A");
		} else if(score>=80) {
			System.out.println("점수 80~89");
			System.out.println("등급 B");	
		} else if(score>=70) {
			System.out.println("점수 70~79");
			System.out.println("등급 C");
		} else {
			System.out.println("점수 70미만");
			System.out.println("더 공부하세요");
			
		}
		

	}

}
