package sec01.exam01;

public class StringEqulasExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		//new 사용 안하는경우: 변수생성시 힙영역을 읽고 동일한 내용이(신민철) 존재하면
		//재사용한다 그래서 번지주소도 동일하다(힙영역 -> 스택영역으로 재사용)
		if(strVar1 == strVar2) {
			System.out.println("var1과 var2 참조 동일");
		}else {
			System.out.println("var1과 var2 참조 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("var1과 var2는 문자열 동일");
			}
		//new 사용하는경우 : 힙영역에 동일데이터(신민철) 존재하더라도 
		//               강제적으로 새로운 번지수(0x:16진수) 부여
		String strVar3 =new String("신민철");
		String strVar4 =new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("var3와 var4는 참조 동일");
		}else {
			System.out.println("var3와 var4는 참조 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("var3와 var4 문자열 동일");
		}
		
	}

}
