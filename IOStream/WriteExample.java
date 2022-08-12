package IOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		//데이터 도착지를 test1.db로하는 바이트기반 파일출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a); //1byte씩 출력
		os.write(b);
		os.write(c);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력(통로청소)
		os.close(); //출력 스트림을 닫음
	}

}
