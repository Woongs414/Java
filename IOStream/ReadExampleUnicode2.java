package IOStream;

import java.io.*;
public class ReadExampleUnicode2 {

	public static void main(String[] args) throws Exception {
	Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		while(true) {
			int readCharNum = reader.read(buffer,2,3);
			if(readCharNum == -1) {
				break;
			}else {
				for(int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		}
		reader.close();

	}

}
