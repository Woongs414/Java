package seco4.verify.exam02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.println("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int Num1 = Integer.parseInt(strNum1);
		int Num2 = Integer.parseInt(strNum2);
		int result = Num1 + Num2;
		
		System.out.println("두 수의 합은: " + result);
		
	
	}

}
