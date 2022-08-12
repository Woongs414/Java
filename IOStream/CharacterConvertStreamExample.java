package IOStream;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		

	}
	public static void write(String str) throws Exception{
	//바이트기반 출력스트림은 test1.db로 나와야한다. 그래서 변환이 필요하다.
	FileOutputStream fos = new FileOutputStream("C:Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	//write()메소드의 매개변수 타입이 String이기에 read()메서드도 String타입이여야한다.
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		System.out.println(readCharNum); 
		//"문자 변환 스트림을 사용합니다." 라는 공간은 
		// char형 배열이며 참조변수명 buffer에 100개의 공간 차열배열중
		// 17자리수를 차지한다.
		reader.close();
		// buffer는 배열이기에 (buffer배열에 0인덱스부터 readCharNum까지 
		// String으로 반환하면 위의 write("~")문자열이 나온다.
		String data = new String(buffer,0,readCharNum);
		return data;
	}
}
