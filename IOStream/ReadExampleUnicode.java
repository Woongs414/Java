package IOStream;

import java.io.*;

public class ReadExampleUnicode {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while(true) {
			int data = reader.read(); //한 문자씩 읽기
			if(data == -1) { 
				break;
			}
			System.out.println((char)data);
		}
		reader.close();
	}

}
