package sec01.exam02;


import java.awt.Toolkit;

//Runnable은 java.lang패키지 안에 존재하는 인터페이스라 바로 구현할수있다.

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
