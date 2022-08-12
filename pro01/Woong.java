package pro01;

public class Woong  {

	public static void main(String[] args)  {


		int running [];
		running = new int[] {42,66,57,54,88,64,72};
		
		int sum=0;
			
		for(int i=0; i<7;i++) {
			sum += running[i];
		}
		System.out.println("달리기의 총합은 : " + sum);
		
		double avg = (double)sum / running.length;
		
	
	System.out.println("달리기의 평균은 :" + avg);
	}
	}
