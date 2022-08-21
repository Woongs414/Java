
public class Practice {
	public static void main(String[] args) {
		//구구단을 만들어 보자
		
		System.out.println("구구단을 외자");
		int i;
		int j;
		
	
		
	for(i=1; i<=9 ;i++) {
		System.out.print(i + "단: ");
		for( j=1; j<=i;j++) {
			int result = i*j;
		System.out.print(j + "*" + i +"=" + result + "\t");
				
				
			}
			System.out.println();
		
		}

	}

}
