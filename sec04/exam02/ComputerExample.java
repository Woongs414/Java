package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer mycom = new Computer();
		
		//먼저 목록값으로 배열생성(배열명: values1) 그리고 sum1매개변수로 목록값대입
		int[] values1 = {1,2,3};
		int result1 = mycom.sum1(values1);
		System.out.println("result1 = " + result1);
		
		//배열생성미리하지않고 sum1의 매개변수로 배열생성 + 목록값 대입
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});
		System.out.println("resutl2 = " + result2);
		
		//sum2매개변수(int...values)는 다중값대입 아래 1,2,3처럼
		int result3 = mycom.sum2(1,2,3);
		System.out.println("result3 = " + result3);
		
		//위와 동일 4 와 5 추가된것
		int result4 = mycom.sum2(1,2,3,4,5);
		System.out.println("result4 = " + result4);
		
		
	
	}

}
